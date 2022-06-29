package com.matthijsverschuure.testapp3.model;

import javax.persistence.*;
import java.util.Set;
import java.util.HashSet;

@MappedSuperclass
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")

    public long id;


    private String rol;
    private String voornaam;
    private String achternaam;
    private String straatEnHuisnummer;
    private String postcode;
    private String woonplaats;

    private long telefoonnummer;

    public String getStraatEnHuisnummer() {
        return straatEnHuisnummer;
    }

    public void setStraatEnHuisnummer(String straatEnHuisnummer) {
        this.straatEnHuisnummer = straatEnHuisnummer;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public long getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(long telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

}