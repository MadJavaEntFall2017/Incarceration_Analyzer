package edu.matc.incarcerationanalyzer.entity;

import javax.persistence.*;

@Entity
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

    @Id
    @Column(name = "ageid", nullable = false)
    public int getAgeid() {
        return ageid;
    }

    public void setAgeid(int ageid) {
        this.ageid = ageid;
    }

    @Basic
    @Column(name = "under18", nullable = true)
    public Integer getUnder18() {
        return under18;
    }

    public void setUnder18(Integer under18) {
        this.under18 = under18;
    }

    @Basic
    @Column(name = "age18to21", nullable = true)
    public Integer getAge18To21() {
        return age18To21;
    }

    public void setAge18To21(Integer age18To21) {
        this.age18To21 = age18To21;
    }

    @Basic
    @Column(name = "age22to25", nullable = true)
    public Integer getAge22To25() {
        return age22To25;
    }

    public void setAge22To25(Integer age22To25) {
        this.age22To25 = age22To25;
    }

    @Basic
    @Column(name = "age26to30", nullable = true)
    public Integer getAge26To30() {
        return age26To30;
    }

    public void setAge26To30(Integer age26To30) {
        this.age26To30 = age26To30;
    }

    @Basic
    @Column(name = "age31to35", nullable = true)
    public Integer getAge31To35() {
        return age31To35;
    }

    public void setAge31To35(Integer age31To35) {
        this.age31To35 = age31To35;
    }

    @Basic
    @Column(name = "age36to40", nullable = true)
    public Integer getAge36To40() {
        return age36To40;
    }

    public void setAge36To40(Integer age36To40) {
        this.age36To40 = age36To40;
    }

    @Basic
    @Column(name = "age41to45", nullable = true)
    public Integer getAge41To45() {
        return age41To45;
    }

    public void setAge41To45(Integer age41To45) {
        this.age41To45 = age41To45;
    }

    @Basic
    @Column(name = "age46to50", nullable = true)
    public Integer getAge46To50() {
        return age46To50;
    }

    public void setAge46To50(Integer age46To50) {
        this.age46To50 = age46To50;
    }

    @Basic
    @Column(name = "age51to55", nullable = true)
    public Integer getAge51To55() {
        return age51To55;
    }

    public void setAge51To55(Integer age51To55) {
        this.age51To55 = age51To55;
    }

    @Basic
    @Column(name = "age56to60", nullable = true)
    public Integer getAge56To60() {
        return age56To60;
    }

    public void setAge56To60(Integer age56To60) {
        this.age56To60 = age56To60;
    }

    @Basic
    @Column(name = "age61to65", nullable = true)
    public Integer getAge61To65() {
        return age61To65;
    }

    public void setAge61To65(Integer age61To65) {
        this.age61To65 = age61To65;
    }

    @Basic
    @Column(name = "over65", nullable = true)
    public Integer getOver65() {
        return over65;
    }

    public void setOver65(Integer over65) {
        this.over65 = over65;
    }

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
