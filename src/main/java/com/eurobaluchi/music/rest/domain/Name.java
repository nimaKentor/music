package com.eurobaluchi.music.rest.domain;

import javax.persistence.*;

@Entity
public class Name {
    private int id;
    private String latin;
    private String english;
    private String farsi;
    private String urdu;
    private String devanagari;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "latin", nullable = false, length = 100)
    public String getLatin() {
        return latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    @Basic
    @Column(name = "english", nullable = true, length = 100)
    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    @Basic
    @Column(name = "farsi", nullable = true, length = 100)
    public String getFarsi() {
        return farsi;
    }

    public void setFarsi(String farsi) {
        this.farsi = farsi;
    }

    @Basic
    @Column(name = "urdu", nullable = true, length = 100)
    public String getUrdu() {
        return urdu;
    }

    public void setUrdu(String urdu) {
        this.urdu = urdu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Name name = (Name) o;

        if (id != name.id) return false;
        if (latin != null ? !latin.equals(name.latin) : name.latin != null) return false;
        if (english != null ? !english.equals(name.english) : name.english != null) return false;
        if (farsi != null ? !farsi.equals(name.farsi) : name.farsi != null) return false;
        if (urdu != null ? !urdu.equals(name.urdu) : name.urdu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (latin != null ? latin.hashCode() : 0);
        result = 31 * result + (english != null ? english.hashCode() : 0);
        result = 31 * result + (farsi != null ? farsi.hashCode() : 0);
        result = 31 * result + (urdu != null ? urdu.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "devanagari", nullable = true, length = 100)
    public String getDevanagari() {
        return devanagari;
    }

    public void setDevanagari(String devanagari) {
        this.devanagari = devanagari;
    }
}
