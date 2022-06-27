package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.*;
import com.matthijsverschuure.testapp3.model.Leerdoel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;


@Service
public class LeerdoelService {
    @Autowired
    LeerdoelRepository leerdoelRepository;

    @Autowired
    CertificaatRepository certificaatRepository;

    @Autowired
    TraineeRepository traineeRepository;

    public Iterable<Leerdoel> haalAlleLeerdoelen() {
        return leerdoelRepository.findAll();
    }
    public Leerdoel nieuwLeerdoel(Leerdoel leerdoel) {
        return leerdoelRepository.save(leerdoel);
    }

    public Leerdoel haalLeerdoelBijId(long id) {
        if (leerdoelRepository.existsById(id)) {
            return leerdoelRepository.findById(id).get();
        }
        return null;
    }



    public void koppelCertificaat(Long leerdoelId, Long certificaatId) {
        Leerdoel leerdoel = leerdoelRepository.findById(leerdoelId).get();
        Certificaat certificaat = certificaatRepository.findById(certificaatId).get();
        leerdoel.setCertificaat(certificaat);
        certificaat.addLeerdoel(leerdoel);
        leerdoelRepository.save(leerdoel);

        System.out.println("Certificaat gekoppeld aan leerdoel.");
    }

    public void koppelLeerdoel(Long leerdoelId, Long traineeId) {
        Leerdoel leerdoel = haalLeerdoelBijId(leerdoelId);
        Trainee trainee = traineeRepository.findById(traineeId).get();
        leerdoel.addTrainee(trainee);
        trainee.addLeerdoel(leerdoel);
        leerdoelRepository.save(leerdoel);

        System.out.println("Leerdoel gekoppeld aan trainee.");
    }



}