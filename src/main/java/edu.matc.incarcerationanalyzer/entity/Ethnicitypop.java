package edu.matc.incarcerationanalyzer.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "ethnicitypop")
public class Ethnicitypop {
    private int ethnicityid;
    private Integer asian;
    private Integer black;
    private Integer hispanic;
    private Integer white;
    private Facility facility;

    public Ethnicitypop() {}

    public Ethnicitypop(Integer asian, Integer black, Integer hispanic, Integer white) {
        this.asian = asian;
        this.black = black;
        this.hispanic = hispanic;
        this.white = white;
    }

    public Ethnicitypop(Integer asian, Integer black, Integer hispanic, Integer white, Facility facility) {
        this.asian = asian;
        this.black = black;
        this.hispanic = hispanic;
        this.white = white;
        this.facility = facility;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "ethnicityid", nullable = false)
    public int getEthnicityid() {
        return ethnicityid;
    }

    public void setEthnicityid(int ethnicityid) {
        this.ethnicityid = ethnicityid;
    }

    @Basic
    @Column(name = "asian", nullable = true)
    public Integer getAsian() {
        return asian;
    }

    public void setAsian(Integer asian) {
        this.asian = asian;
    }

    @Basic
    @Column(name = "black", nullable = true)
    public Integer getBlack() {
        return black;
    }

    public void setBlack(Integer black) {
        this.black = black;
    }

    @Basic
    @Column(name = "hispanic", nullable = true)
    public Integer getHispanic() {
        return hispanic;
    }

    public void setHispanic(Integer hispanic) {
        this.hispanic = hispanic;
    }

    @Basic
    @Column(name = "white", nullable = true)
    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public Facility getFacility() {
        return this.facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

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
