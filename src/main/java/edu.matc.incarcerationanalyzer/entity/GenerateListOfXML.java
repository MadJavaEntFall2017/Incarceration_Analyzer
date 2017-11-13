package edu.matc.incarcerationanalyzer.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "listFacility")
public class GenerateListOfXML {
    //private FacilityXML facilityXML;
    private List<FacilityXML> listFacility;
    private List<AgePopXML> listOfAge;
    private List<EthnicPopXML> listOfEthnic;
    private List<GroupOfXML> listOfGroup;

    public GenerateListOfXML(){
        listFacility = new ArrayList<>();
        listOfAge = new ArrayList<>();
        listOfEthnic = new ArrayList<>();
        listOfGroup = new ArrayList<>();
    }

    @XmlElement
    public List<FacilityXML> getListFacility() {
        return listFacility;
    }

    public void setListFacility(List<FacilityXML> listFacility) {
        this.listFacility = listFacility;
    }

    @XmlElement
    public List<AgePopXML> getListOfAge() {
        return listOfAge;
    }

    public void setListOfAge(List<AgePopXML> listOfAge) {
        this.listOfAge = listOfAge;
    }

    @XmlElement
    public List<EthnicPopXML> getListOfEthnic() {
        return listOfEthnic;
    }

    @XmlElement
    public List<GroupOfXML> getListOfGroup() {
        return listOfGroup;
    }

    public void setListOfGroup(List<GroupOfXML> listOfGroup) {
        this.listOfGroup = listOfGroup;
    }

    public void setListOfEthnic(List<EthnicPopXML> listOfEthnic) {
        this.listOfEthnic = listOfEthnic;
    }

    public void addFacility(FacilityXML facilityXML){
        listFacility.add(facilityXML);
    }

    public void addAge(AgePopXML agePopXML){
        listOfAge.add(agePopXML);
    }

    public void addEthnic(EthnicPopXML ethnicPopXML){listOfEthnic.add(ethnicPopXML);}

    public void addGroupOfXml(GroupOfXML groupOfXML){
        listOfGroup.add(groupOfXML);
    }
}
