package edu.matc.incarcerationanalyzer.entity;

public class EthnicpopSQL {
    private Integer ethnicId;
    private Integer facilityId;
    private Integer asian;
    private Integer black;
    private Integer hispanic;
    private Integer white;

    public EthnicpopSQL(){}

    public Integer getEthnicId() {
        return ethnicId;
    }

    public void setEthnicId(Integer ethnicId) {
        this.ethnicId = ethnicId;
    }

    public Integer getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Integer facilityId) {
        this.facilityId = facilityId;
    }

    public Integer getAsian() {
        return asian;
    }

    public void setAsian(Integer asian) {
        this.asian = asian;
    }

    public Integer getBlack() {
        return black;
    }

    public void setBlack(Integer black) {
        this.black = black;
    }

    public Integer getHispanic() {
        return hispanic;
    }

    public void setHispanic(Integer hispanic) {
        this.hispanic = hispanic;
    }

    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    @Override
    public String toString() {
        return "\n{" +
                "\n\tethnicId=" + ethnicId +
                ", \n\tfacilityId=" + facilityId +
                ", \n\tasian=" + asian +
                ", \n\tblack=" + black +
                ", \n\thispanic=" + hispanic +
                ", \n\twhite=" + white + "\n"+
                '}';
    }
}
