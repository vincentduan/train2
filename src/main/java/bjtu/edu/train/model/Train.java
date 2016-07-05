package bjtu.edu.train.model;

public class Train {
    private Integer id;

    private String startStation;

    private String endStation;

    private String startTime;

    private String actualLength;

    private String endTime;

    private String runingTime;

    private String loadFactor;

    private String fileName;

    private Double maxAcceleration;

    private Double minusAcceleration;

    private Double maxaccelerationRate;

    private Double minusaccelerationRate;

    private Double stationPrecision;

    private Integer ebiNum;

    private String info;

    private String field1;

    private String field2;

    private String field3;

    private String field4;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation == null ? null : startStation.trim();
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation == null ? null : endStation.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getActualLength() {
        return actualLength;
    }

    public void setActualLength(String actualLength) {
        this.actualLength = actualLength == null ? null : actualLength.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getRuningTime() {
        return runingTime;
    }

    public void setRuningTime(String runingTime) {
        this.runingTime = runingTime == null ? null : runingTime.trim();
    }

    public String getLoadFactor() {
        return loadFactor;
    }

    public void setLoadFactor(String loadFactor) {
        this.loadFactor = loadFactor == null ? null : loadFactor.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Double getMaxAcceleration() {
        return maxAcceleration;
    }

    public void setMaxAcceleration(Double maxAcceleration) {
        this.maxAcceleration = maxAcceleration;
    }

    public Double getMinusAcceleration() {
        return minusAcceleration;
    }

    public void setMinusAcceleration(Double minusAcceleration) {
        this.minusAcceleration = minusAcceleration;
    }

    public Double getMaxaccelerationRate() {
        return maxaccelerationRate;
    }

    public void setMaxaccelerationRate(Double maxaccelerationRate) {
        this.maxaccelerationRate = maxaccelerationRate;
    }

    public Double getMinusaccelerationRate() {
        return minusaccelerationRate;
    }

    public void setMinusaccelerationRate(Double minusaccelerationRate) {
        this.minusaccelerationRate = minusaccelerationRate;
    }

    public Double getStationPrecision() {
        return stationPrecision;
    }

    public void setStationPrecision(Double stationPrecision) {
        this.stationPrecision = stationPrecision;
    }

    public Integer getEbiNum() {
        return ebiNum;
    }

    public void setEbiNum(Integer ebiNum) {
        this.ebiNum = ebiNum;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1 == null ? null : field1.trim();
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2 == null ? null : field2.trim();
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3 == null ? null : field3.trim();
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4 == null ? null : field4.trim();
    }
}