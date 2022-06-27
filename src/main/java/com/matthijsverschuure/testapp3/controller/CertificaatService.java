package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.Certificaat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;


@Service
public class CertificaatService {
    @Autowired
    CertificaatRepository certificaatRepository;

    @Autowired
    LeerdoelService leerdoelService;

    @Autowired
    LeerdoelRepository leerdoelRepository;



    public Iterable<Certificaat> haalAlleCertificaten() {
        return certificaatRepository.findAll();
    }
    public Certificaat nieuwCertificaat(Certificaat c) {
        return certificaatRepository.save(c);
    }

    public Certificaat haalCertificaatBijId(long id) {
        if (certificaatRepository.existsById(id)) {
            return certificaatRepository.findById(id).get();
        }
        return null;
    }



}