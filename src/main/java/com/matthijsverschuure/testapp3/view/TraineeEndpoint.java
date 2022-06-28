package com.matthijsverschuure.testapp3.view;

import com.matthijsverschuure.testapp3.controller.TraineeService;
import com.matthijsverschuure.testapp3.model.HrMedewerker;
import com.matthijsverschuure.testapp3.model.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping ("/trainee")
public class TraineeEndpoint {
    @Autowired
    TraineeService traineeService;

    @GetMapping("/all")
    public Iterable<Trainee> haalAlleTrainees() {
        return traineeService.haalAlleTrainees();
    }
    @PostMapping("/nieuwe-trainee/{leidinggevendeId}/{hrMedewerkerId}")
    public Trainee nieuweTrainee(@RequestBody Trainee trainee, @PathVariable(value = "leidinggevendeId") long leidinggevendeId, @PathVariable(value = "hrMedewerkerId") long hrMedewerkerId) {
        return traineeService.nieuweTrainee(trainee, leidinggevendeId, hrMedewerkerId);
    }

    @PostMapping("/nieuwe-trainee")
    public Trainee nieuweTrainee(@RequestBody Trainee trainee) {
        return traineeService.nieuweTrainee(trainee);
    }

    @GetMapping("/{id}")
    public Trainee haalTraineeBijId(@PathVariable(value = "id") long id) {
        Trainee trainee = traineeService.haalTraineeBijId(id);
        if (trainee == null) {
            throw new NoSuchElementException("Trainee bestaat niet in de database.");
        }
        return trainee;
    }

    @DeleteMapping("/{id}")
    public void verwijderTraineeBijID(@PathVariable(value = "id") long id) {
        traineeService.verwijderTraineeBijID(id);
    }

    @PostMapping("/{traineeId}/leidinggevende/{leidinggevendeId}")
    public void koppelLeidinggevende(@PathVariable(value = "traineeId") long traineeId, @PathVariable(value = "leidinggevendeId") long leidinggevendeId) {
        traineeService.koppelLeidinggevende(traineeId, leidinggevendeId);
    }

    @PostMapping("/{traineeId}/hrmedewerker/{hrMedewerkerId}")
    public void koppelhrMedewerker(@PathVariable(value = "traineeId") long traineeId, @PathVariable(value = "hrMedewerkerId") long hrMedewerkerId) {
        traineeService.koppelHrMedewerker(traineeId, hrMedewerkerId);

        //TODO Exception voor als traineeId of hrMedewerkerId niet bestaat.


    }


}



