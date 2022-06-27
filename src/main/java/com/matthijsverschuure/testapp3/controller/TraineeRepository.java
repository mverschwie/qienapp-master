package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.Trainee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface TraineeRepository extends CrudRepository<Trainee, Long> {
}
