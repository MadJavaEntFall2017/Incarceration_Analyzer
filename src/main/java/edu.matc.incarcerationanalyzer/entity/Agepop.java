package edu.matc.incarcerationanalyzer.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;
/**
 * Agepop is an entity class that represents the agepop table
 * in the database. It holds data on inmate population by age.
 *
 * @author Brian Kruse
 */
@Entity
@Table(name = "agepop")
public class Agepop {
    private int ageid;
    private Integer under18;
    private Integer age18To21;
    private Integer age22To25;
    private Integer age26To30;
    private Integer age31To35;
    private Integer age36To40;
    private Integer age41To45;
    private Integer age46To50;
    private Integer age51To55;
    private Integer age56To60;
    private Integer age61To65;
    private Integer over65;

    //empty constructor
    public Agepop() {}

    /**
     * constructor with variables
     * @param under18 number of inmates under 18
     * @param age18To21 number of inmates age 18 to 21
     * @param age22To25 number of inmates age 22 to 25
     * @param age26To30 number of inmates age 26 to 30
     * @param age31To35 number of inmates age 31 to 35
     * @param age36To40 number of inmates age 36 to 40
     * @param age41To45 number of inmates age 41 to 45
     * @param age46To50 number of inmates age 46 to 50
     * @param age51To55 number of inmates age 51 to 55
     * @param age56To60 number of inmates age 56 to 60
     * @param age61To65 number of inmates age 61 to 65
     * @param over65 number of inmates over 65
     */
    public Agepop (Integer under18, Integer age18To21,
                   Integer age22To25, Integer age26To30,
                   Integer age31To35, Integer age36To40,
                   Integer age41To45, Integer age46To50,
                   Integer age51To55, Integer age56To60,
                   Integer age61To65, Integer over65) {
                    this.under18 = under18;
                    this.age18To21 = age18To21;
                    this.age22To25 = age22To25;
                    this.age26To30 = age26To30;
                    this.age31To35 = age31To35;
                    this.age36To40 = age36To40;
                    this.age41To45 = age41To45;
                    this.age46To50 = age46To50;
                    this.age51To55 = age51To55;
                    this.age56To60 = age56To60;
                    this.age61To65 = age61To65;
                    this.over65 = over65;
    }

    /**
     * Returns ageid the id for the entry in the agepop table
     * @return ageid the id for the entry in the agepop table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "ageid", nullable = false)
    public int getAgeid() {
        return ageid;
    }

    /**
     * Sets the ageid for the agepop object
     * @param ageid the id for the agepop entry
     */
    public void setAgeid(int ageid) {
        this.ageid = ageid;
    }


    /**
     * Returns the number of inmates that are under 18
     * @return under18 the number of inmates under 18
     */
    @Basic
    @Column(name = "under18", nullable = true)
    public Integer getUnder18() {
        return under18;
    }

    /**
     * Sets the number of inmates under the age of 18
     * @param under18 the number of inmates under the age of 18
     */
    public void setUnder18(Integer under18) {
        this.under18 = under18;
    }


    /**
     * Returns the number of inmates age 18 to 21
     * @return under18 the number of inmates age 18 to 21
     */
    @Basic
    @Column(name = "age18to21", nullable = true)
    public Integer getAge18To21() {
        return age18To21;
    }

    /**
     * Sets the number of inmates age 18 to 21
     * @param age18To21 the number of inmates age 18 to 21
     */
    public void setAge18To21(Integer age18To21) {
        this.age18To21 = age18To21;
    }


    /**
     * Returns the number of inmates age 22 to 25
     * @return age22To25 the number of inmates age 22 to 25
     */
    @Basic
    @Column(name = "age22to25", nullable = true)
    public Integer getAge22To25() {
        return age22To25;
    }

    /**
     * Sets the number of inmates age 22 to 25
     * @param age22To25 the number of inmates age 22 to 25
     */
    public void setAge22To25(Integer age22To25) {
        this.age22To25 = age22To25;
    }

    /**
     * Returns the number of inmates age 26 to 30
     * @return age26to30 the number of inmates age 26 to 30
     */
    @Basic
    @Column(name = "age26To30", nullable = true)
    public Integer getAge26To30() {
        return age26To30;
    }

    /**
     * Sets the number of inmates age 26 to 30
     * @param age26To30 the number of inmates age 26 to 30
     */
    public void setAge26To30(Integer age26To30) {
        this.age26To30 = age26To30;
    }


    /**
     * Returns the number of inmates age age 31 to 35
     * @return age26To30 the number of inmates age 31 to 35
     */
    @Basic
    @Column(name = "age31to35", nullable = true)
    public Integer getAge31To35() {
        return age31To35;
    }

    /**
     * Sets the number of inmates age 31 to 35
     * @param age31To35 the number of inmates age 31 to 35
     */
    public void setAge31To35(Integer age31To35) {
        this.age31To35 = age31To35;
    }


    /**
     * Returns the number of inmates age 36 to 40
     * @return age36To40 the number of inmates age 36 to 40
     */
    @Basic
    @Column(name = "age36to40", nullable = true)
    public Integer getAge36To40() {
        return age36To40;
    }

    /**
     * Sets the number of inmates age 36 to 40
     * @param age36To40 the number of inmates age 36 to 40
     */
    public void setAge36To40(Integer age36To40) {
        this.age36To40 = age36To40;
    }


    /**
     * Returns the number of inmates age 41 to 45
     * @return age41To45 the number of inmates age 41 to 45
     */
    @Basic
    @Column(name = "age41to45", nullable = true)
    public Integer getAge41To45() {
        return age41To45;
    }

    /**
     * Sets the number of inmates age 41 to 45
     * @param age41To45 the number of inmates age 41 to 45
     */
    public void setAge41To45(Integer age41To45) {
        this.age41To45 = age41To45;
    }


    /**
     * Returns the number of inmates age 46 to 50
     * @return age46To50 the number of inmates age 46 to 50
     */
    @Basic
    @Column(name = "age46to50", nullable = true)
    public Integer getAge46To50() {
        return age46To50;
    }

    /**
     * Sets the number of inmates age 46 to 50
     * @param age46To50 the number of inmates age 46 to 50
     */
    public void setAge46To50(Integer age46To50) {
        this.age46To50 = age46To50;
    }


    /**
     * Returns the number of inmates age 51 to 55
     * @return age51To55 the number of inmates age 51 to 55
     */
    @Basic
    @Column(name = "age51to55", nullable = true)
    public Integer getAge51To55() {
        return age51To55;
    }
    /**
     * Sets the number of inmates age 51 to 55
     * @param age51To55 the number of inmates age 51 to 55
     */
    public void setAge51To55(Integer age51To55) {
        this.age51To55 = age51To55;
    }


    /**
     * Returns the number of inmates age 56 to 60
     * @return age56To60 the number of inmates age 56 to 60
     */
    @Basic
    @Column(name = "age56to60", nullable = true)
    public Integer getAge56To60() {
        return age56To60;
    }

    /**
     * Sets the number of inmates age 56 to 60
     * @param age56To60 the number of inmates age 56 to 60
     */
    public void setAge56To60(Integer age56To60) {
        this.age56To60 = age56To60;
    }


    /**
     * Returns the number of inmates age 61 to 65
     * @return age61To65 the number of inmates age 61 to 65
     */
    @Basic
    @Column(name = "age61to65", nullable = true)
    public Integer getAge61To65() {
        return age61To65;
    }

    /**
     * Sets the number of inmates age 61 to 65
     * @param age61To65 the number of inmates age 61 to 65
     */
    public void setAge61To65(Integer age61To65) {
        this.age61To65 = age61To65;
    }


    /**
     * Returns the number of inmates age 61 to 65
     * @return over65 the number of inmates age 61 to 65
     */
    @Basic
    @Column(name = "over65", nullable = true)
    public Integer getOver65() {
        return over65;
    }

    /**
     * Sets the number of inmates over 65
     * @param over65 the number of inmates over 65
     */
    public void setOver65(Integer over65) {
        this.over65 = over65;
    }


    /**
     * Overide method for .equal
     * @param o object for comparison
     * @return boolean true
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Agepop agepop = (Agepop) o;

        if (ageid != agepop.ageid) return false;
        if (under18 != null ? !under18.equals(agepop.under18) : agepop.under18 != null) return false;
        if (age18To21 != null ? !age18To21.equals(agepop.age18To21) : agepop.age18To21 != null) return false;
        if (age22To25 != null ? !age22To25.equals(agepop.age22To25) : agepop.age22To25 != null) return false;
        if (age26To30 != null ? !age26To30.equals(agepop.age26To30) : agepop.age26To30 != null) return false;
        if (age31To35 != null ? !age31To35.equals(agepop.age31To35) : agepop.age31To35 != null) return false;
        if (age36To40 != null ? !age36To40.equals(agepop.age36To40) : agepop.age36To40 != null) return false;
        if (age41To45 != null ? !age41To45.equals(agepop.age41To45) : agepop.age41To45 != null) return false;
        if (age46To50 != null ? !age46To50.equals(agepop.age46To50) : agepop.age46To50 != null) return false;
        if (age51To55 != null ? !age51To55.equals(agepop.age51To55) : agepop.age51To55 != null) return false;
        if (age56To60 != null ? !age56To60.equals(agepop.age56To60) : agepop.age56To60 != null) return false;
        if (age61To65 != null ? !age61To65.equals(agepop.age61To65) : agepop.age61To65 != null) return false;
        if (over65 != null ? !over65.equals(agepop.over65) : agepop.over65 != null) return false;

        return true;
    }


    /**
     * overide method for hashCode
     * @return result the hashcode
     */
    @Override
    public int hashCode() {
        int result = ageid;
        result = 31 * result + (under18 != null ? under18.hashCode() : 0);
        result = 31 * result + (age18To21 != null ? age18To21.hashCode() : 0);
        result = 31 * result + (age22To25 != null ? age22To25.hashCode() : 0);
        result = 31 * result + (age26To30 != null ? age26To30.hashCode() : 0);
        result = 31 * result + (age31To35 != null ? age31To35.hashCode() : 0);
        result = 31 * result + (age36To40 != null ? age36To40.hashCode() : 0);
        result = 31 * result + (age41To45 != null ? age41To45.hashCode() : 0);
        result = 31 * result + (age46To50 != null ? age46To50.hashCode() : 0);
        result = 31 * result + (age51To55 != null ? age51To55.hashCode() : 0);
        result = 31 * result + (age56To60 != null ? age56To60.hashCode() : 0);
        result = 31 * result + (age61To65 != null ? age61To65.hashCode() : 0);
        result = 31 * result + (over65 != null ? over65.hashCode() : 0);
        return result;
    }
}
