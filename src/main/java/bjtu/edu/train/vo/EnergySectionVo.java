package bjtu.edu.train.vo;

import java.util.List;

import bjtu.edu.train.model.EnergySection;

public class EnergySectionVo {
	String id;
	List<EnergySection> energySections;
	String fileName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<EnergySection> getEnergySections() {
		return energySections;
	}
	public void setEnergySections(List<EnergySection> energySections) {
		this.energySections = energySections;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
}
