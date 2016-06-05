package bjtu.edu.train.controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import bjtu.edu.train.dao.TrainDataMapper;
import bjtu.edu.train.model.EnergySection;
import bjtu.edu.train.model.TrainData;
import bjtu.edu.train.ser.TrainService;
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
		logger.debug("menu");
		logger.debug(Thread.currentThread().getName());
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
	public String upload(@RequestParam("file") CommonsMultipartFile[] file,
			HttpServletRequest request, HttpServletResponse response,
			ModelMap map) {
		logger.debug("upload-post");
		String rootpath = request.getSession().getServletContext()
				.getRealPath("/");
		trainService.saveDatas(file);
		return "train-result";
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 * @author 段丁阳
	 */
	@RequestMapping(value = "help", method = RequestMethod.GET)
	public String help(HttpServletRequest request,
			HttpServletResponse response, ModelMap map) {
		return "layout/help";
	}

	@RequestMapping(value = "/getEnergySections", method = RequestMethod.POST)
	@ResponseBody
	public List<EnergySection> getEnergySection() {
		List<EnergySection> list = trainService.getEnergySections();
		return list;
	}

	@RequestMapping(value = "/getEnergySection", method = RequestMethod.POST)
	@ResponseBody
	public List<TrainDataVo> getEnergySectionById(int id) {
		EnergySection energySection = trainService.getEnergySectionById(id);
		List<TrainData> trainDatas = trainService
				.getTrainDataByFileNameAndStartAndEnd(energySection.getInfo(),
						energySection.getStart(), energySection.getEnd());
		List<Double> Data2 = new LinkedList<>();//speed
		List<Double> Data3 = new LinkedList<>();//slope
		for (int i = 0; i < trainDatas.size(); i++) {
			TrainData trainData = trainDatas.get(i);
			Data2.add(trainData.getSpeed());
			Data3.add(trainData.getSlope());
		}
		List<TrainDataVo> l = new LinkedList<>();
		TrainDataVo trainDataVo = new TrainDataVo();
		trainDataVo.setName("speed");
		trainDataVo.setVodata(Data2);
		trainDataVo.setSlope(Data3);
		trainDataVo.setPointInterval("200");
		l.add(trainDataVo);
		return l;
	}
	
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
		trainDataVo2.setName("speed");
		trainDataVo2.setVodata2(vodata2);
		trainDataVo2.setSlope2(slope2);
		l.add(trainDataVo2);
		return l;
	}

}