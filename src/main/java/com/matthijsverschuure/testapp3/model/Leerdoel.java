package com.matthijsverschuure.testapp3.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "leerdoel")
public class Leerdoel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    private String omschrijvingLeerdoel;
    private String datumAfgerond;
    private boolean isBehaald;

    private String verslag;

    private String soort;

    @ManyToOne
    @JoinColumn(name = "certificaatId")
    private Certificaat certificaat;

    public Certificaat getCertificaat() {
        return certificaat;
    }

    public void setCertificaat(Certificaat certificaat) {
        this.certificaat = certificaat;
    }

    public String getOmschrijvingLeerdoel() {
        return omschrijvingLeerdoel;
    }

    public void setOmschrijvingLeerdoel(String omschrijvingLeerdoel) {
        this.omschrijvingLeerdoel = omschrijvingLeerdoel;
    }

    public String getDatumAfgerond() {
        return datumAfgerond;
    }

    public void setDatumAfgerond(String datumAfgerond) {
        this.datumAfgerond = datumAfgerond;
    }

    public boolean getIsBehaald() {
        return isBehaald;
    }

    public void setIsBehaald(boolean IsBehaald) {
        this.isBehaald = isBehaald;
    }

    public String getVerslag() {
        return verslag;
    }

    public void setVerslag(String verslag) {
        this.verslag = verslag;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public enum Soort {
        HARDSKILL, SOFTSKILL
    }

    @ManyToMany
    @JsonBackReference
    public List<Trainee> trainees = new ArrayList<>();

    public void addTrainee(Trainee t){
        this.trainees.add(t);
    }


}
