package bjtu.edu.train.vo;

import java.util.List;

public class TrainDataVo {
	private String name;
	private List<Double> vodata;//speed
	private List<Double> slope;//slope
	private String pointInterval;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public List<Double> getSlope() {
		return slope;
	}
	public void setSlope(List<Double> slope) {
		this.slope = slope;
	}
	public List<Double> getVodata() {
		return vodata;
	}
	public void setVodata(List<Double> vodata) {
		this.vodata = vodata;
	}
	public String getPointInterval() {
		return pointInterval;
	}
	public void setPointInterval(String pointInterval) {
		this.pointInterval = pointInterval;
	}
	
}
