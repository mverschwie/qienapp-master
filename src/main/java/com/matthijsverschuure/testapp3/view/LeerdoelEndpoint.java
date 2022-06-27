package com.matthijsverschuure.testapp3.view;


import com.matthijsverschuure.testapp3.controller.LeerdoelService;
import com.matthijsverschuure.testapp3.controller.TraineeService;
import com.matthijsverschuure.testapp3.model.Leerdoel;
import com.matthijsverschuure.testapp3.model.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping ("/leerdoel")
public class LeerdoelEndpoint {
    @Autowired
    LeerdoelService leerdoelService;

    @GetMapping("/all")
    public Iterable<Leerdoel> haalAlleLeerdoelen() {
        return leerdoelService.haalAlleLeerdoelen();

    }
    @PostMapping("/nieuw-leerdoel")
    public Leerdoel nieuwLeerdoel(@RequestBody Leerdoel leerdoel) {
        return leerdoelService.nieuwLeerdoel(leerdoel);
    }

    @PostMapping("/{leerdoelId}/trainee/{traineeId}")
    public void koppelLeerdoel(@PathVariable(value = "leerdoelId") long leerdoelId, @PathVariable(value = "traineeId") long traineeId) {
        leerdoelService.koppelLeerdoel(leerdoelId, traineeId);
    }

    @GetMapping("/{id}")
    public Leerdoel haalLeerdoelBijId(@PathVariable(value = "id") long id) {
        Leerdoel leerdoel = leerdoelService.haalLeerdoelBijId(id);
        if (leerdoel == null) {
            throw new NoSuchElementException("Leerdoel bestaat niet in de database.");
        }
        return leerdoel;
    }

    @PostMapping("/{leerdoelId}/certificaat/{certificaatId}")
    public void koppelCertificaat(@PathVariable(value = "leerdoelId") long leerdoelId, @PathVariable(value = "certificaatId") long certificaatId) {
        leerdoelService.koppelCertificaat(leerdoelId, certificaatId);
    }

}



