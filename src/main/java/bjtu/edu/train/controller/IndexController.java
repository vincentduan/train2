package bjtu.edu.train.controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import bjtu.edu.train.model.EnergySection;
import bjtu.edu.train.model.Train;
import bjtu.edu.train.model.TrainData;
import bjtu.edu.train.ser.TrainService;
import bjtu.edu.train.vo.EnergySectionVo;
import bjtu.edu.train.vo.TrainDataVo;
import bjtu.edu.train.vo.TrainDataVo2;

@Controller
@RequestMapping(value = "/index")
public class IndexController {
	private static Logger logger = Logger.getLogger(IndexController.class);
	@Autowired
	private TrainService trainService;

	/**
	 * 
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 * @author 段丁阳
	 */
	@RequestMapping(value = "upload", method = RequestMethod.GET)
	public String menu(HttpServletRequest request,
			HttpServletResponse response, ModelMap map) {
		return "index";
	}

	/**
	 * 
	 * @param file
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String upload(@RequestParam("file") CommonsMultipartFile[] file,HttpSession httpSession) {
		trainService.saveDatas(file,httpSession);
		return "contrast";
	}
	//列车对比
	@RequestMapping(value = "/contrast")
	public String contrast() {
		return "contrast";
	}

	
	//得到所有站间
	@RequestMapping(value = "/getEnergySections", method = RequestMethod.POST)
	@ResponseBody
	public List<EnergySection> getEnergySection() {
		List<EnergySection> list = trainService.getEnergySections();
		return list;
	}
	
	//得到所有站间对比(contrast)
	@RequestMapping(value = "/contrastEnergySections", method = RequestMethod.POST)
	@ResponseBody
	public List<EnergySectionVo> contrastEnergySection(HttpSession httpSession) {
		List<String> list = (List<String>) httpSession.getAttribute("file_Names");
		List<EnergySectionVo> energySectionVos = new LinkedList<>();
		for(String fileName : list){
			List<EnergySection> energySections = trainService.findSectionByName(fileName);
			EnergySectionVo energySectionVo = new EnergySectionVo();
			Train train = trainService.findTrainByFileName(fileName);
			energySectionVo.setFileName(fileName);
			energySectionVo.setId(train.getId()+"");
			energySectionVo.setEnergySections(energySections);
			energySectionVos.add(energySectionVo);
		}
		return energySectionVos;
	}
	
	
	//得到某一站间的数据，以时间为依据
	@RequestMapping(value = "/getEnergySection", method = RequestMethod.POST)
	@ResponseBody
	public List<TrainDataVo> getEnergySectionById(int id) {
		EnergySection energySection = trainService.getEnergySectionById(id);
		List<TrainData> trainDatas = trainService
				.getTrainDataByFileNameAndStartAndEnd(energySection.getInfo(),
						energySection.getStart(), energySection.getEnd());
		Train train = trainService.findTrainByFileName(energySection.getInfo());
		List<Double> Data2 = new LinkedList<>();//speed
		List<Double> Data3 = new LinkedList<>();//slope
		for (int i = 0; i < trainDatas.size(); i++) {
			TrainData trainData = trainDatas.get(i);
			Data2.add(trainData.getSpeed());
			Data3.add(trainData.getSlope());
		}
		List<TrainDataVo> l = new LinkedList<>();
		TrainDataVo trainDataVo = new TrainDataVo();
		trainDataVo.setId(train.getId()+"");
		trainDataVo.setName(energySection.getInfo());
		trainDataVo.setVodata(Data2);
		trainDataVo.setSlope(Data3);
		trainDataVo.setPointInterval("200");
		l.add(trainDataVo);
		return l;
	}
	//得到某一站间的数据，以距离为依据
	@RequestMapping(value = "/getEnergySection2", method = RequestMethod.POST)
	@ResponseBody
	public List<TrainDataVo2> getEnergySectionById2(int id) {
		EnergySection energySection = trainService.getEnergySectionById(id);
		List<TrainData> trainDatas = trainService
				.getTrainDataByFileNameAndStartAndEnd(energySection.getInfo(),
						energySection.getStart(), energySection.getEnd());
		List<List<Double>> vodata2 = new LinkedList<List<Double>>();
		List<List<Double>> slope2 = new LinkedList<List<Double>>();
		for (int i = 0; i < trainDatas.size(); i++) {
			TrainData trainData = trainDatas.get(i);
			List<Double> speed_distance = new LinkedList<>();//speed
			speed_distance.add(Double.parseDouble(trainData.getInfo()));
			speed_distance.add(trainData.getSpeed());
			vodata2.add(speed_distance);
			List<Double> slope_distance = new LinkedList<>();//slope
			slope_distance.add(Double.parseDouble(trainData.getInfo()));
			slope_distance.add(trainData.getSlope());
			slope2.add(slope_distance);
		}
		List<TrainDataVo2> l = new LinkedList<>();
		TrainDataVo2 trainDataVo2 = new TrainDataVo2();
		trainDataVo2.setName(energySection.getInfo());
		trainDataVo2.setVodata2(vodata2);
		trainDataVo2.setSlope2(slope2);
		l.add(trainDataVo2);
		return l;
	}
	//得到所有站间数据项
	@RequestMapping(value = "/getEnergySectionField", method = RequestMethod.POST)
	@ResponseBody
	public List<EnergySection> getEnergySectionField(){
		List<EnergySection> energySections = trainService.getEnergySections();
		List<EnergySection> energySections2 = new LinkedList<>();
		for(EnergySection energySection : energySections){
			String filename = energySection.getInfo();
			String start = energySection.getStart();
			String end = energySection.getEnd();
			if(energySection.getRuntime()==null||"".equals(energySection.getRuntime())){
				EnergySection energySections_temp = trainService.setEnergySectionField(filename,start,end);
				energySections2.add(energySections_temp);
			}
		}
		return energySections2;
	}

}