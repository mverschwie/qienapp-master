package com.matthijsverschuure.testapp3.view;

import com.matthijsverschuure.testapp3.controller.HrMedewerkerService;
import com.matthijsverschuure.testapp3.model.HrMedewerker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping ("/hrmedewerker")
public class HrMedewerkerEndpoint {
    @Autowired
    HrMedewerkerService hrMedewerkerService;

    @GetMapping("/all")
    public Iterable<HrMedewerker> haalAlleHrMedewerkers() {
        return hrMedewerkerService.haalAlleHrMedewerkers();

    }
    @PostMapping("/nieuwe-hrmedewerker")
    public HrMedewerker nieuweHrMedewerker(@RequestBody HrMedewerker hrMedewerker) {
        return hrMedewerkerService.nieuweHrMedewerker(hrMedewerker);
    }

    @GetMapping("/{id}")
    public HrMedewerker haalHrMedewerkerBijId(@PathVariable (value = "id")long id) {
            HrMedewerker hrMedewerker = hrMedewerkerService.haalHrMedewerkerBijId(id);
            if (hrMedewerker == null) {
                throw new NoSuchElementException("Hr-Medewerker bestaat niet in de database.");
            }
            return hrMedewerker;
    }
}



