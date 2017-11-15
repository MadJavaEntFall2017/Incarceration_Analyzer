package edu.matc.incarcerationanalyzer.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "age")
@XmlType(propOrder = {"ageId", "facilityId", "under18", "age18to21", "age22to25", "age26to30", "age31to35", "age36to40",
            "age41to45", "age46to50", "age51to55", "age56to60", "age61to65", "over65"})
public class AgePopXML {
    private Integer ageId;
    private Integer facilityId;
    private Integer under18;
    private Integer age18to21;
    private Integer age22to25;
    private Integer age26to30;
    private Integer age31to35;
    private Integer age36to40;
    private Integer age41to45;
    private Integer age46to50;
    private Integer age51to55;
    private Integer age56to60;
    private Integer age61to65;
    private Integer over65;

    @XmlElement
    public Integer getAgeId() {
        return ageId;
    }
    @XmlElement
    public Integer getFacilityId() {
        return facilityId;
    }
    @XmlElement
    public Integer getUnder18() {
        return under18;
    }
    @XmlElement
    public Integer getAge18to21() {
        return age18to21;
    }
    @XmlElement
    public Integer getAge22to25() {
        return age22to25;
    }
    @XmlElement
    public Integer getAge26to30() {
        return age26to30;
    }
    @XmlElement
    public Integer getAge31to35() {
        return age31to35;
    }
    @XmlElement
    public Integer getAge36to40() {
        return age36to40;
    }
    @XmlElement
    public Integer getAge41to45() {
        return age41to45;
    }
    @XmlElement
    public Integer getAge46to50() {
        return age46to50;
    }
    @XmlElement
    public Integer getAge51to55() {
        return age51to55;
    }
    @XmlElement
    public Integer getAge56to60() {
        return age56to60;
    }
    @XmlElement
    public Integer getAge61to65() {
        return age61to65;
    }
    @XmlElement
    public Integer getOver65() {
        return over65;
    }

    public void setAgeId(Integer ageId) {
        this.ageId = ageId;
    }

    public void setFacilityId(Integer facilityId) {
        this.facilityId = facilityId;
    }

    public void setUnder18(Integer under18) {
        this.under18 = under18;
    }

    public void setAge18to21(Integer age18to21) {
        this.age18to21 = age18to21;
    }

    public void setAge22to25(Integer age22to25) {
        this.age22to25 = age22to25;
    }

    public void setAge26to30(Integer age26to30) {
        this.age26to30 = age26to30;
    }

    public void setAge31to35(Integer age31to35) {
        this.age31to35 = age31to35;
    }

    public void setAge36to40(Integer age36to40) {
        this.age36to40 = age36to40;
    }

    public void setAge41to45(Integer age41to45) {
        this.age41to45 = age41to45;
    }

    public void setAge46to50(Integer age46to50) {
        this.age46to50 = age46to50;
    }

    public void setAge51to55(Integer age51to55) {
        this.age51to55 = age51to55;
    }

    public void setAge56to60(Integer age56to60) {
        this.age56to60 = age56to60;
    }

    public void setAge61to65(Integer age61to65) {
        this.age61to65 = age61to65;
    }

    public void setOver65(Integer over65) {
        this.over65 = over65;
    }

    public AgePopXML(){}

    @Override
    public String toString() {
        return "AgePopXML{" +
                "ageId=" + ageId +
                ", facilityId=" + facilityId +
                ", under18=" + under18 +
                ", age18to21=" + age18to21 +
                ", age22to25=" + age22to25 +
                ", age26to30=" + age26to30 +
                ", age31to35=" + age31to35 +
                ", age36to40=" + age36to40 +
                ", age41to45=" + age41to45 +
                ", age46to50=" + age46to50 +
                ", age51to55=" + age51to55 +
                ", age56to60=" + age56to60 +
                ", age61to65=" + age61to65 +
                ", over65=" + over65 +
                '}';
    }
}
