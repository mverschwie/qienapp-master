package com.matthijsverschuure.testapp3.view;

import com.matthijsverschuure.testapp3.controller.CertificaatService;
import com.matthijsverschuure.testapp3.controller.LeerdoelService;
import com.matthijsverschuure.testapp3.model.Certificaat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping ("/certificaat")
public class CertificaatEndpoint {
    @Autowired
    CertificaatService certificaatService;

    @Autowired
    LeerdoelService leerdoelService;

    @GetMapping("/all")
    public Iterable<Certificaat> haalAlleCertificaten() {
        return certificaatService.haalAlleCertificaten();

    }
    @PostMapping("/nieuw-certificaat")
    public Certificaat nieuwCertificaat(@RequestBody Certificaat certificaat) {
        return certificaatService.nieuwCertificaat(certificaat);
    }
    @GetMapping("/{id}")
    public Certificaat haalCertificaatBijId(@PathVariable(value = "id") long id) {

        Certificaat certificaat = certificaatService.haalCertificaatBijId(id);
        if (certificaat == null) {
            throw new NoSuchElementException("Certificaat bestaat niet in de database.");
        }
        return certificaat;
    }








}



