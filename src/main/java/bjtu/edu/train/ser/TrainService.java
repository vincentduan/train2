package bjtu.edu.train.ser;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import bjtu.edu.train.model.EnergySection;
import bjtu.edu.train.model.Train;
import bjtu.edu.train.model.TrainData;

public interface TrainService {
	public boolean saveDatas(CommonsMultipartFile[] files, HttpSession httpSession);

	public List<EnergySection> getEnergySections();
	
	public List<TrainData> getTrainDataByFileNameAndStartAndEnd(String fileName,String start,String end);

	public EnergySection getEnergySectionById(int id);

	public List<EnergySection> findSectionByName(String fileName);

	public Train findTrainByFileName(String fileName);

	public EnergySection setEnergySectionField(String filename,
			String start, String end);

}
