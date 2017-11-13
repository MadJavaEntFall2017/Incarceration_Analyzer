package edu.matc.incarcerationanalyzer.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GroupOfXML {
    private FacilityXML facilityXML;
    private EthnicPopXML ethnicPopXML;
    private AgePopXML agePopXML;

    @XmlElement
    public FacilityXML getFacilityXML() {
        return facilityXML;
    }

    public void setFacilityXML(FacilityXML facilityXML) {
        this.facilityXML = facilityXML;
    }
    @XmlElement
    public EthnicPopXML getEthnicPopXML() {
        return ethnicPopXML;
    }

    public void setEthnicPopXML(EthnicPopXML ethnicPopXML) {
        this.ethnicPopXML = ethnicPopXML;
    }
    @XmlElement
    public AgePopXML getAgePopXML() {
        return agePopXML;
    }

    public void setAgePopXML(AgePopXML agePopXML) {
        this.agePopXML = agePopXML;
    }
}
