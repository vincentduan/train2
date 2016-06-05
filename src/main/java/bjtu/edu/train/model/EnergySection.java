package bjtu.edu.train.model;

public class EnergySection {
    private Integer id;

    private String start;

    private String end;

    private Double energe;

    private String info;

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
}