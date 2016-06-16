package bjtu.edu.train.serviceImpl;

import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpSession;

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
import bjtu.edu.train.model.TrainExample;
import bjtu.edu.train.ser.TrainService;
import bjtu.edu.train.vo.EnergySectionVo;

@Service
public class TrainServiceImpl implements TrainService {
	
	@Autowired
	private TrainDataMapper trainDataMapper;
	@Autowired
	private EnergySectionMapper energySectionMapper;
	@Autowired
	private TrainMapper trainMapper;

	@Override
	public boolean saveDatas(CommonsMultipartFile[] files,HttpSession httpSession) {
		energySectionMapper.deleteAll();
		trainDataMapper.deleteAll();
		trainMapper.deleteAll();
		List<String> file_Names = new LinkedList<>();
		for (int i = 0; i < files.length; i++) {
			List<TrainData> trainDataList = new LinkedList<>();
			List<EnergySection> energySectionList = new LinkedList<>();
			if (!files[i].isEmpty()) {
				try{
					FileInputStream in = (FileInputStream) files[i].getInputStream();
					XSSFWorkbook wb = new XSSFWorkbook(in);
					XSSFSheet sheet = wb.getSheetAt(1);
					String file_name = files[i].getFileItem().getName();
					file_Names.add(file_name);
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
						if(speed==0.0){
							continue;
						}
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
					//保存文件信息
					Train train = new Train();
					train.setFileName(file_name);
					this.saveTrain(train);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		httpSession.setAttribute("file_Names", file_Names);
		return true;
	}
	//保存数据
	public void saveTrainDatas(List<TrainData> trainDataList){
		trainDataMapper.addTrainRecordBatch(trainDataList);
	}
	//保存站间信息
	public void saveEnergySection(List<EnergySection> energySections){
		energySectionMapper.addEnergyRecordBatch(energySections);
	}
	//保存列车信息
	public void saveTrain(Train train){
		trainMapper.insertSelective(train);
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
	
	/**
	 * 根据id获得站名
	 */
	@Override
	public EnergySection getEnergySectionById(int id) {
		EnergySection energySection = energySectionMapper.selectByPrimaryKey(id);
		return energySection;
	}
	
	//根据文件名得到所有站
	@Override
	public List<EnergySection> findSectionByName(String fileName) {
		EnergySectionExample energySectionExample = new EnergySectionExample();
		EnergySectionExample.Criteria criteria = energySectionExample.createCriteria();
		criteria.andInfoEqualTo(fileName);
		List<EnergySection> list = energySectionMapper.selectByExample(energySectionExample);
		return list;
	}
	//根据文件名得到文件id
	@Override
	public Train findTrainByFileName(String fileName) {
		TrainExample trainExample = new TrainExample();
		TrainExample.Criteria criteria = trainExample.createCriteria();
		criteria.andFileNameEqualTo(fileName);
		List<Train> trains = trainMapper.selectByExample(trainExample);
		return trains.get(0);
	}

}
