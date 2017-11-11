package edu.matc.incarcerationanalyzer.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "list")
public class XMLList {
    private FacilityXML facilityXML;
    private List<FacilityXML> list;

    public XMLList(){
        list = new ArrayList<>();
    }

    @XmlElement
    public List<FacilityXML> getList() {
        return list;
    }

    public void setList(List<FacilityXML> list) {
        this.list = list;
    }

    public void addFacility(FacilityXML facilityXML){
        list.add(facilityXML);
    }
}
