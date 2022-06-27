package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.Coach;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface CoachRepository extends CrudRepository<Coach, Long> {
}
