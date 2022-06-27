package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;


@Service
public class TraineeService {
    @Autowired
    TraineeRepository traineeRepository;

    @Autowired
    LeidinggevendeRepository leidinggevendeRepository;

    @Autowired
    HrMedewerkerRepository hrMedewerkerRepository;

    public Iterable<Trainee> haalAlleTrainees() {
        return traineeRepository.findAll();
    }
    public Trainee nieuweTrainee(Trainee trainee, long leidinggevendeId, long hrMedewerkerId) {
        Leidinggevende leidinggevende = leidinggevendeRepository.findById(leidinggevendeId).get();
        leidinggevende.trainees.add(trainee);
        trainee.setLeidinggevende(leidinggevende);
        HrMedewerker hrMedewerker = hrMedewerkerRepository.findById(hrMedewerkerId).get();
        hrMedewerker.trainees.add(trainee);
        trainee.setHrMedewerker(hrMedewerker);
        return traineeRepository.save(trainee);

    }

    public Trainee nieuweTrainee(Trainee trainee) {
        return traineeRepository.save(trainee);
    }
    public Trainee haalTraineeBijId(long id) {
        if (traineeRepository.existsById(id)) {
            return traineeRepository.findById(id).get();
        }
        return null;

    }

    public void verwijderTraineeBijID(long id) {
        traineeRepository.deleteById(id);
    }

    public void koppelLeidinggevende(long traineeId, long leidinggevendeId) {
        Trainee trainee = haalTraineeBijId(traineeId);
        Leidinggevende leidinggevende = leidinggevendeRepository.findById(leidinggevendeId).get();
        trainee.setLeidinggevende(leidinggevende);
        leidinggevende.addTrainee(trainee);
        traineeRepository.save(trainee);

        System.out.println("Leidinggevende gekoppeld aan trainee.");
    }


    public void koppelHrMedewerker(long traineeId, long hrMedewerkerId) {
        Trainee trainee = traineeRepository.findById(traineeId).get();
        HrMedewerker hrMedewerker = hrMedewerkerRepository.findById(hrMedewerkerId).get();
        trainee.setHrMedewerker(hrMedewerker);
        hrMedewerker.addTrainee(trainee);
        traineeRepository.save(trainee);

        System.out.println("Hr-medewerker gekoppeld aan trainee.");
    }



}