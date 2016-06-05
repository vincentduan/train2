package bjtu.edu.train.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bjtu.edu.train.ser.TrainService;





/**
 * 
 * Title: <br>
 * Description: <br>
 * Date: 2016Äê1ÔÂ24ÈÕ <br>
 * 
 * @author ¶Î¶¡Ñô
 */
@Controller
@RequestMapping(value = "/train")
public class TrainController {

	TrainService trainService;

	public static final String path = "";
	private static Logger logger = Logger.getLogger(TrainController.class);

	/**
	 * 
	 * @return
	 * @author ¶Î¶¡Ñô
	 */
	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public String uploadView(HttpServletRequest request, HttpServletResponse response) {
		logger.debug("upload");
		return path + "train-upload";
	}

	
}
