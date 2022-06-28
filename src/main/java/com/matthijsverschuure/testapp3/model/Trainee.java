package com.matthijsverschuure.testapp3.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "trainee")

public class Trainee extends User {


    @ManyToMany
    @JsonBackReference
    public List<Coach> coaches = new ArrayList<>();
    public void addCoach(Coach c) {
        this.coaches.add(c);
    }

    @ManyToMany
    public List<Leerdoel> leerdoelen = new ArrayList<>();
    public void addLeerdoel(Leerdoel leerdoel) {
        this.leerdoelen.add(leerdoel);
    }

    @ManyToOne
    @JoinColumn(name = "leidinggevende_Id")
    private Leidinggevende leidinggevende;

    public Leidinggevende getLeidinggevende() {
        return leidinggevende;
    }

    public void setLeidinggevende(Leidinggevende leidinggevende) {
        this.leidinggevende = leidinggevende;
    }

    @ManyToOne
    @JoinColumn(name = "hrMedewerkerId")
    private HrMedewerker hrMedewerker;

    public HrMedewerker getHrMedewerker() {
        return hrMedewerker;
    }
    public void setHrMedewerker(HrMedewerker hrMedewerker) {
        this.hrMedewerker = hrMedewerker;
    }




}