package bjtu.edu.train.serviceImpl;

import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import bjtu.edu.train.dao.EnergySectionMapper;
import bjtu.edu.train.dao.TrainDataMapper;
import bjtu.edu.train.dao.TrainMapper;
import bjtu.edu.train.model.EnergySection;
import bjtu.edu.train.model.EnergySectionExample;
import bjtu.edu.train.model.Train;
import bjtu.edu.train.model.TrainData;
import bjtu.edu.train.model.TrainDataExample;
import bjtu.edu.train.ser.TrainService;

@Service
public class TrainServiceImpl implements TrainService {
	
	@Autowired
	private TrainDataMapper trainDataMapper;
	@Autowired
	private EnergySectionMapper energySectionMapper;
	@Autowired
	private TrainMapper trainMapper;

	@Override
	public boolean saveDatas(CommonsMultipartFile[] files) {
		energySectionMapper.deleteAll();
		trainDataMapper.deleteAll();
		for (int i = 0; i < files.length; i++) {
			List<TrainData> trainDataList = new LinkedList<>();
			List<Train> trainList = new LinkedList<>();
			List<EnergySection> energySectionList = new LinkedList<>();
			if (!files[i].isEmpty()) {
				try{
					FileInputStream in = (FileInputStream) files[i].getInputStream();
					XSSFWorkbook wb = new XSSFWorkbook(in);
					XSSFSheet sheet = wb.getSheetAt(1);
					String file_name = files[i].getFileItem().getName();
					int lastRowNum = sheet.getLastRowNum();
					//保存站信息
					XSSFRow row_temp = sheet.getRow(2);
					for(int k = 1; k < row_temp.getLastCellNum()-1 ;k++){
						EnergySection energySection = new EnergySection();
						energySection.setStart(row_temp.getCell(k).getStringCellValue());
						if(row_temp.getCell(k+1).getStringCellValue().equals("")){
							break;
						}
						energySection.setEnd(row_temp.getCell(k+1).getStringCellValue());
						energySection.setInfo(file_name);
						energySection.setEnerge(0.0);
						energySectionList.add(energySection);
					}
					this.saveEnergySection(energySectionList);
					DecimalFormat df=new DecimalFormat("0.00");
					for (int j = 11; j < lastRowNum; j++) {
						XSSFRow row = sheet.getRow(j);
						String startStation = row.getCell(27).getStringCellValue();
						String endStation = row.getCell(28).getStringCellValue();
						//保存数据
						double speed = row.getCell(9).getNumericCellValue();
						double slope = row.getCell(18).getNumericCellValue();
						row.getCell(11).setCellType(Cell.CELL_TYPE_NUMERIC); 
						double distance = row.getCell(11).getNumericCellValue();
						//row.getCell(11).setCellType(Cell.CELL_TYPE_STRING);
						//String distance2 = row.getCell(11).getStringCellValue();
						double force = "".equals(row.getCell(20).getStringCellValue())?0.0:row.getCell(20).getNumericCellValue();
						double power = "".equals(row.getCell(21).getStringCellValue())?0.0:row.getCell(21).getNumericCellValue();
						TrainData trainData = new TrainData();
						trainData.setStartStation(startStation);
						trainData.setEndStation(endStation);
						trainData.setFileName(file_name);
						trainData.setSpeed(speed);
						trainData.setTraction(force);
						trainData.setSlope(slope);
						trainData.setPower(power);
						trainData.setInfo(df.format(distance).toString());
						trainDataList.add(trainData);
						if((sheet.getRow(j+1).getCell(0)+"").equals("")){
							break;
						}
					}
					this.saveTrainDatas(trainDataList);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			
		}
		return true;
	}
	public void saveTrainDatas(List<TrainData> trainDataList){
//		List<TrainData> l = new LinkedList<>();
//		TrainData data = new TrainData();
//		data.setId(0);
//		data.setFileName("ssss");
//		data.setStartStation("sdfsdf");
//		data.setEndStation("23fdsdf");
//		data.setTraction(12.9);
//		data.setSlope(13.9);
//		data.setSpeed(14.9);
//		data.setPower(15.9);
//		l.add(data);
		trainDataMapper.addTrainRecordBatch(trainDataList);
	}
	public void saveEnergySection(List<EnergySection> energySections){
//		List<EnergySection> l = new LinkedList<>();
//		EnergySection data = new EnergySection();
//		data.setStart("sdfsd");
//		data.setEnd("ffffff");
//		data.setInfo("fdfffffssss");
//		data.setEnerge(0.9);
//		l.add(data);
		energySectionMapper.addEnergyRecordBatch(energySections);
	}
	/**
	 * 获得所有站间
	 */
	@Override
	public List<EnergySection> getEnergySections() {
		EnergySectionExample energySectionExample = new EnergySectionExample();
		energySectionExample.createCriteria();
		List<EnergySection> list = energySectionMapper.selectByExample(energySectionExample);
		return list;
	}
	/**
	 * 根据文件名，始发站，终点站得到区间的数据
	 */
	@Override
	public List<TrainData> getTrainDataByFileNameAndStartAndEnd(
			String fileName, String start, String end) {
		TrainDataExample trainDataExample = new TrainDataExample();
		TrainDataExample.Criteria criteria = trainDataExample.createCriteria();
		criteria.andStartStationEqualTo(start);
		criteria.andEndStationEqualTo(end);
		criteria.andFileNameEqualTo(fileName);
		List<TrainData> list = trainDataMapper.selectByExample(trainDataExample);
		return list;
	}
	@Override
	public EnergySection getEnergySectionById(int id) {
		EnergySection energySection = energySectionMapper.selectByPrimaryKey(id);
		return energySection;
	}

}
