package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.Coach;
import com.matthijsverschuure.testapp3.model.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;


@Service
public class CoachService {
    @Autowired
    CoachRepository coachRepository;

    @Autowired
    TraineeService traineeService;

    public Iterable<Coach> haalAlleCoaches() {
        return coachRepository.findAll();
    }
    public Coach nieuweCoach(Coach coach) {
        return coachRepository.save(coach);
    }

    public Coach haalCoachBijId(long id) {
        if (coachRepository.existsById(id)) {
            return coachRepository.findById(id).get();
        }
        return null;
    }

    public void koppelCoachAanTrainee(long coachId, long traineeId) {
        Coach c = haalCoachBijId(coachId);
        Trainee t = traineeService.haalTraineeBijId(traineeId);
        c.addTrainee(t);
        t.addCoach(c);
        coachRepository.save(c);
    }
}