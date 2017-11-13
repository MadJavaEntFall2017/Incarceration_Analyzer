package edu.matc.incarcerationanalyzer.utility;

import edu.matc.incarcerationanalyzer.entity.*;

public class Convertions {

    public FacilityXML facilityToXML(FacilityXML facilityXML, Facility facility){
        facilityXML.setId(facility.getFacilityid());
        facilityXML.setName(facility.getName());
        facilityXML.setPopulation(facility.getPopulation());

        return facilityXML;
    }

    public AgePopXML ageToXML(AgePopXML agePopXML, Agepop agepop){
        agePopXML.setAgeId(agepop.getAgeid());
        agePopXML.setAge18to21(agepop.getAge18To21());
        agePopXML.setAge22to25(agepop.getAge22To25());
        agePopXML.setAge26to30(agepop.getAge26To30());
        agePopXML.setAge31to35(agepop.getAge31To35());
        agePopXML.setAge36to40(agepop.getAge36To40());
        agePopXML.setAge41to45(agepop.getAge41To45());
        agePopXML.setAge46to50(agepop.getAge46To50());
        agePopXML.setAge51to55(agepop.getAge51To55());
        agePopXML.setAge56to60(agepop.getAge56To60());
        agePopXML.setAge61to65(agepop.getAge61To65());
        agePopXML.setOver65(agepop.getOver65());
        return agePopXML;
    }

    public EthnicPopXML ethnicToXML(EthnicPopXML ethnicPopXML, Ethnicitypop ethnicitypop){
        ethnicPopXML.setEthnicId(ethnicitypop.getEthnicityid());
        ethnicPopXML.setAsian(ethnicitypop.getAsian());
        ethnicPopXML.setBlack(ethnicitypop.getBlack());
        ethnicPopXML.setHispanic(ethnicitypop.getHispanic());
        ethnicPopXML.setWhite(ethnicitypop.getWhite());
        return ethnicPopXML;
    }
}
