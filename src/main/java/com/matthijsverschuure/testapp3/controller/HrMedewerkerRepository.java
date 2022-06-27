package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.HrMedewerker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface HrMedewerkerRepository extends CrudRepository<HrMedewerker, Long> {
}