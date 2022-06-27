//package com.matthijsverschuure.testapp3.controller;
//
//import com.matthijsverschuure.testapp3.model.Adres;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//
//@Service
//public class AdresService {
//    @Autowired
//    AdresRepository adresRepository;
//
//    public Iterable<Adres> haalAlleAdressen() {
//        return adresRepository.findAll();
//    }
//    public Adres nieuwAdres(Adres adres) {
//        return adresRepository.save(adres);
//    }
//
//    public Adres haalAdresBijID(long id) {
//        if (adresRepository.existsById(id)) {
//            return adresRepository.findById(id).get();
//        }
//        return null;
//    }
//}