package com.matthijsverschuure.testapp3.view;


import com.matthijsverschuure.testapp3.controller.LeidinggevendeService;
import com.matthijsverschuure.testapp3.model.Leidinggevende;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/leidinggevende")
public class LeidinggevendeEndpoint {

    @Autowired
    LeidinggevendeService leidinggevendeService;

    @GetMapping("/all")
    public Iterable<Leidinggevende> haalAlleLeidinggevenden() {
        return leidinggevendeService.haalAlleLeidinggevenden();
    }

    @GetMapping("/{id}")
    public Leidinggevende haalLeidinggevendeBijID(@PathVariable(value = "id") long id) {
        Leidinggevende leidinggevende = leidinggevendeService.haalLeidinggevendeBijId(id);
        if (leidinggevende == null) {
            throw new NoSuchElementException("Leidinggevende bestaat niet in de database.");
        }
        return leidinggevende;
    }
    @PostMapping("/nieuwe-leidinggevende")
    public Leidinggevende nieuweLeidinggevende(@RequestBody Leidinggevende leidinggevende) {
        return leidinggevendeService.nieuweLeidinggevende(leidinggevende);
    }


}
