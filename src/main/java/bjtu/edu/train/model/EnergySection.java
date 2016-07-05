package bjtu.edu.train.model;

public class EnergySection {
    private Integer id;

    private String start;

    private String end;

    private Double energe;

    private String info;

    private String runtime;

    private Double maxacceleration;

    private Double minusacceleration;

    private Double maxaccelerationRate;

    private Double minusaccelerationRate;

    private Integer ebi;

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

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end == null ? null : end.trim();
    }

    public Double getEnerge() {
        return energe;
    }

    public void setEnerge(Double energe) {
        this.energe = energe;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime == null ? null : runtime.trim();
    }

    public Double getMaxacceleration() {
        return maxacceleration;
    }

    public void setMaxacceleration(Double maxacceleration) {
        this.maxacceleration = maxacceleration;
    }

    public Double getMinusacceleration() {
        return minusacceleration;
    }

    public void setMinusacceleration(Double minusacceleration) {
        this.minusacceleration = minusacceleration;
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

    public Integer getEbi() {
        return ebi;
    }

    public void setEbi(Integer ebi) {
        this.ebi = ebi;
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