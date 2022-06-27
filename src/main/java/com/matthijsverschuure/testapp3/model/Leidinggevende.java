package com.matthijsverschuure.testapp3.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "leidinggevende")
public class Leidinggevende extends User {

    @OneToMany(mappedBy = "leidinggevende")
    @JsonBackReference
    public List<Trainee> trainees = new ArrayList<>();

    public void addTrainee(Trainee trainee) {
        this.trainees.add(trainee);
    }

}
