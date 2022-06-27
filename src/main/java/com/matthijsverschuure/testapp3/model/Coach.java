package com.matthijsverschuure.testapp3.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "coach")


public class Coach extends User {

    @ManyToMany
    public List<Trainee> trainees = new ArrayList<>();

    public void addTrainee(Trainee t){
        this.trainees.add(t);
    }

}