package bjtu.edu.train.ser;

import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import bjtu.edu.train.model.EnergySection;
import bjtu.edu.train.model.TrainData;

public interface TrainService {
	public boolean saveDatas(CommonsMultipartFile[] files);

	public List<EnergySection> getEnergySections();
	
	public List<TrainData> getTrainDataByFileNameAndStartAndEnd(String fileName,String start,String end);

	public EnergySection getEnergySectionById(int id);
}
