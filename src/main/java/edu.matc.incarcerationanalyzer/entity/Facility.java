package edu.matc.incarcerationanalyzer.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="facility")
public class Facility {
    private int facilityid;
    private String name;
    private Integer population;
    private Agepop agepop;
    private Ethnicitypop ethnicitypop;

    public Facility() {}
    public Facility(String name, Integer population) {
        this.name = name;
        this.population = population;
    }
    public Facility(String name, Integer population, Agepop agepop, Ethnicitypop ethnicitypop) {
        this.name = name;
        this.population = population;
        this.agepop = agepop;
        this.ethnicitypop = ethnicitypop;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "facilityid", nullable = false)
    public int getFacilityid() {
        return facilityid;
    }

    public void setFacilityid(int facilityid) {
        this.facilityid = facilityid;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "population", nullable = true)
    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public Agepop getAgepop() {
        return this.agepop;
    }

    public void setAgepop(Agepop agepop) {
        this.agepop = agepop;
    }

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public Ethnicitypop getEthnicitypop() {
        return this.ethnicitypop;
    }

    public void setEthnicitypop(Ethnicitypop ethnicitypop) {
        this.ethnicitypop = ethnicitypop;
    }


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

    @Override
    public int hashCode() {
        int result = facilityid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (population != null ? population.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "facilityid=" + facilityid +
                ", name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}