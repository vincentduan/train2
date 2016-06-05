package bjtu.edu.train.vo;

import java.util.List;

public class TrainDataVo2 {
	private String name;
	private List<List<Double>> vodata2;//speed
	private List<List<Double>> slope2;//slope
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<List<Double>> getVodata2() {
		return vodata2;
	}
	public void setVodata2(List<List<Double>> vodata2) {
		this.vodata2 = vodata2;
	}
	public List<List<Double>> getSlope2() {
		return slope2;
	}
	public void setSlope2(List<List<Double>> slope2) {
		this.slope2 = slope2;
	}
	
}
