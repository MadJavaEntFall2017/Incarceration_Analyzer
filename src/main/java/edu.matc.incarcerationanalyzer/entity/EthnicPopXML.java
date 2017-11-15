package edu.matc.incarcerationanalyzer.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"ethnicId", "facilityId", "asian", "black", "hispanic", "white"})
public class EthnicPopXML {
    private Integer ethnicId;
    private Integer facilityId;
    private Integer asian;
    private Integer black;
    private Integer hispanic;
    private Integer white;

    @XmlElement
    public Integer getEthnicId() {
        return ethnicId;
    }
    @XmlElement
    public Integer getFacilityId() {
        return facilityId;
    }
    @XmlElement
    public Integer getAsian() {
        return asian;
    }
    @XmlElement
    public Integer getBlack() {
        return black;
    }
    @XmlElement
    public Integer getHispanic() {
        return hispanic;
    }
    @XmlElement
    public Integer getWhite() {
        return white;
    }

    public void setEthnicId(Integer ethnicId) {
        this.ethnicId = ethnicId;
    }

    public void setFacilityId(Integer facilityId) {
        this.facilityId = facilityId;
    }

    public void setAsian(Integer asian) {
        this.asian = asian;
    }

    public void setBlack(Integer black) {
        this.black = black;
    }

    public void setHispanic(Integer hispanic) {
        this.hispanic = hispanic;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    public EthnicPopXML(){}

    @Override
    public String toString() {
        return "EthnicPopXML{" +
                "ethnicId=" + ethnicId +
                ", facilityId=" + facilityId +
                ", asian=" + asian +
                ", black=" + black +
                ", hispanic=" + hispanic +
                ", white=" + white +
                '}';
    }
}
