package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.Leidinggevende;
import com.matthijsverschuure.testapp3.model.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class LeidinggevendeService {
    @Autowired
    LeidinggevendeRepository leidinggevendeRepository;

    @Autowired
    TraineeService traineeService;

    public Iterable<Leidinggevende> haalAlleLeidinggevenden() {
        return leidinggevendeRepository.findAll();
    }
    public Leidinggevende nieuweLeidinggevende(Leidinggevende leidinggevende) {
        return leidinggevendeRepository.save(leidinggevende);
    }

    public Leidinggevende haalLeidinggevendeBijId(long id) {
        if (leidinggevendeRepository.existsById(id)) {
            return leidinggevendeRepository.findById(id).get();
        }
        return null;
    }

}