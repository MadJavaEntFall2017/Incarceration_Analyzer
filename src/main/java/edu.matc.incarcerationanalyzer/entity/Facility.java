package edu.matc.incarcerationanalyzer.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;
/**
 * Facility the main entity class that represents the ethnicitypop table
 * in the database. It has two tables holding data, Ethnicitypop and Agepop.
 *
 * @author Brian Kruse
 */
@Entity
@Table(name="facility")
public class Facility {
    private int facilityid;
    private String name;
    private Integer population;
    private Agepop agepop;
    private Ethnicitypop ethnicitypop;

    //empty constructor
    public Facility() {}

    /**
     * Constructor with primative values
     * @param name the name of the facility
     * @param population the population of the facility
     */
    public Facility(String name, Integer population) {
        this.name = name;
        this.population = population;
    }

    /**
     * Constructor with primative data types and object types
     * @param name
     * @param population
     * @param agepop
     * @param ethnicitypop
     */
    public Facility(String name, Integer population, Agepop agepop, Ethnicitypop ethnicitypop) {
        this.name = name;
        this.population = population;
        this.agepop = agepop;
        this.ethnicitypop = ethnicitypop;
    }

    /**
     * Returns the facility id
     * @return facilityid the id of the facility
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "facilityid", nullable = false)
    public int getFacilityid() {
        return facilityid;
    }

    /**
     * Sets the facility id
     * @param facilityid the facility id
     */
    public void setFacilityid(int facilityid) {
        this.facilityid = facilityid;
    }


    /**
     * Returns the name of the facility
     * @return name the name of the facility
     */
    @Basic
    @Column(name = "name", nullable = true, length = 30)
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the facility
     * @param name the name of the facility
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Returns the population of the facility
     * @return population the population of the facility
     */
    @Basic
    @Column(name = "population", nullable = true)
    public Integer getPopulation() {
        return population;
    }

    /**
     * Sets the population of the facility
     * @param population the poulation of the facility
     */
    public void setPopulation(Integer population) {
        this.population = population;
    }


    /**
     * Returns the object representing the age/population data
     * @return agepop the object holding age/population data
     */
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public Agepop getAgepop() {
        return this.agepop;
    }

    /**
     * Sets the object holding age/population data
     * @param agepop the object holding age/population data
     */
    public void setAgepop(Agepop agepop) {
        this.agepop = agepop;
    }


    /**
     * Returns the object representing the ethnicity/population data
     * @return ethnicitypop the object holding the ethnicity/population data
     */
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public Ethnicitypop getEthnicitypop() {
        return this.ethnicitypop;
    }

    /**
     * Sets ethnicitypop the object respresenting ethnicity/population data
     * @param ethnicitypop the object holding ethnicity/population data
     */
    public void setEthnicitypop(Ethnicitypop ethnicitypop) {
        this.ethnicitypop = ethnicitypop;
    }


    /**
     * Override method for comparison
     * @param o the object being compared
     * @return boolean true
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Facility facility = (Facility) o;

        if (facilityid != facility.facilityid) return false;
        if (name != null ? !name.equals(facility.name) : facility.name != null) return false;
        if (population != null ? !population.equals(facility.population) : facility.population != null) return false;

        return true;
    }

    /**
     * Override method for hashcode
     * @return result the resulting hashcode
     */
    @Override
    public int hashCode() {
        int result = facilityid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (population != null ? population.hashCode() : 0);
        return result;
    }

    /**
     * Override method for toString
     * @return String a string of information data
     */
    @Override
    public String toString() {
        return "Facility{" +
                "facilityid=" + facilityid +
                ", name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}