package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.HrMedewerker;
import com.matthijsverschuure.testapp3.model.Leerdoel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HrMedewerkerService {
    @Autowired
    HrMedewerkerRepository hrMedewerkerRepository;

    public Iterable<HrMedewerker> haalAlleHrMedewerkers() {
        return hrMedewerkerRepository.findAll();
    }
    public HrMedewerker nieuweHrMedewerker(HrMedewerker hrMedewerker) {
        return hrMedewerkerRepository.save(hrMedewerker);
    }

    public HrMedewerker haalHrMedewerkerBijId(long id) {
        if (hrMedewerkerRepository.existsById(id)) {
            return hrMedewerkerRepository.findById(id).get();
        }
        return null;
    }

}