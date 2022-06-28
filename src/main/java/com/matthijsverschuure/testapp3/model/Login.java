package com.matthijsverschuure.testapp3.model;


import javax.persistence.*;

@Entity
@Table(name = "login")

public class Login {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    private String email;

    private String wachtwoord;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord ){
        this.wachtwoord = wachtwoord;
    }
}

