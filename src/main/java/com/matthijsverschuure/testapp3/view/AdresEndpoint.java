//package com.matthijsverschuure.testapp3.view;
//
//import com.matthijsverschuure.testapp3.controller.AdresService;
//import com.matthijsverschuure.testapp3.model.Adres;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping ("/adres")
//public class AdresEndpoint {
//    @Autowired
//    AdresService adresService;
//
//    @GetMapping("/all")
//    public Iterable<Adres> haalAlleAdressen() {
//        return adresService.haalAlleAdressen();
//
//    }
//    @PostMapping("/nieuw-adres")
//    public Adres nieuwAdres(@RequestBody Adres adres) {
//        return adresService.nieuwAdres(adres);
//    }
//    @GetMapping("/{id}")
//    public Adres haalAdresBijID(@PathVariable(value = "id") long id) {
//        return adresService.haalAdresBijID(id);
//    }
//
//
//}
//
//
//
