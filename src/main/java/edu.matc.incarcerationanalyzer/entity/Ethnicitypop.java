package edu.matc.incarcerationanalyzer.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Ethnicitypop is an entity class that represents the ethnicitypop table
 * in the database. It holds data on inmate population by ethnicity.
 *
 * @author Brian Kruse
 */
@Entity
@Table(name = "ethnicitypop")
public class Ethnicitypop {
    private int ethnicityid;
    private Integer asian;
    private Integer black;
    private Integer hispanic;
    private Integer white;
    private Facility facility;

    //No argument constructor
    public Ethnicitypop() {}

    /**
     * Constructor with data fields
     * @param asian
     * @param black
     * @param hispanic
     * @param white
     */
    public Ethnicitypop(Integer asian, Integer black, Integer hispanic, Integer white) {
        this.asian = asian;
        this.black = black;
        this.hispanic = hispanic;
        this.white = white;
    }

    /**
     * Constructor with data fields and facility object
     * @param asian
     * @param black
     * @param hispanic
     * @param white
     * @param facility
     */
    public Ethnicitypop(Integer asian, Integer black, Integer hispanic, Integer white, Facility facility) {
        this.asian = asian;
        this.black = black;
        this.hispanic = hispanic;
        this.white = white;
        this.facility = facility;
    }

    /**
     * Returns the ethnicity ID
     * @return ethncityid The id database entry
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "ethnicityid", nullable = false)
    public int getEthnicityid() {
        return ethnicityid;
    }

    /**
     * Sets the value of ethnicityid
     * @param ethnicityid the id of the entry
     */
    public void setEthnicityid(int ethnicityid) {
        this.ethnicityid = ethnicityid;
    }


    /**
     * returns the number of inmates that are asian
     * @return asian the number of asian inmates
     */
    @Basic
    @Column(name = "asian", nullable = true)
    public Integer getAsian() {
        return asian;
    }

    /**
     * Sets the number of asian inmates
     * @param asian the number of asian inmates
     */
    public void setAsian(Integer asian) {
        this.asian = asian;
    }


    /**
     * Returns the number of black inmates for the facility
     * @return black the number of inmates that are black
     */
    @Basic
    @Column(name = "black", nullable = true)
    public Integer getBlack() {
        return black;
    }

    /**
     * Sets the number of black inmates
     * @param black the number of black inmates
     */
    public void setBlack(Integer black) {
        this.black = black;
    }


    /**
     * Returns the number of hispanic inmates
     * @return hispanic the number of hispanic inmates
     */
    @Basic
    @Column(name = "hispanic", nullable = true)

    public Integer getHispanic() {
        return hispanic;
    }
    /**
     * Sets the nuumber of hispanic inmates
     * @param hispanic the number of hispanic inmates
     */
    public void setHispanic(Integer hispanic) {
        this.hispanic = hispanic;
    }


    /**
     * Returns the number of white inmates
     * @return white the number of hispanic inmates
     */
    @Basic
    @Column(name = "white", nullable = true)

    public Integer getWhite() {
        return white;
    }
    /**
     * Sets the number of white inmates
     * @param white the number of white inmates
     */
    public void setWhite(Integer white) {
        this.white = white;
    }


    /**
     * returns the facility object
     * @return facility the object respresenting the facility
     */
    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public Facility getFacility() {
        return this.facility;
    }

    /**
     * Sets the facility object
     * @param facility the object representing the facility
     */
    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    /**
     * Override for equals()
     * @param o the object to test for equivalence
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ethnicitypop that = (Ethnicitypop) o;

        if (ethnicityid != that.ethnicityid) return false;
        if (asian != null ? !asian.equals(that.asian) : that.asian != null) return false;
        if (black != null ? !black.equals(that.black) : that.black != null) return false;
        if (hispanic != null ? !hispanic.equals(that.hispanic) : that.hispanic != null) return false;
        if (white != null ? !white.equals(that.white) : that.white != null) return false;

        return true;
    }

    /**
     * overide method for hashcode
     * @return result hashcode
     */
    @Override
    public int hashCode() {
        int result = ethnicityid;
        result = 31 * result + (asian != null ? asian.hashCode() : 0);
        result = 31 * result + (black != null ? black.hashCode() : 0);
        result = 31 * result + (hispanic != null ? hispanic.hashCode() : 0);
        result = 31 * result + (white != null ? white.hashCode() : 0);
        return result;
    }
}
