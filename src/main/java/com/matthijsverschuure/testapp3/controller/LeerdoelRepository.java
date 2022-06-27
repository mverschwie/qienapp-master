package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.Leerdoel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface LeerdoelRepository extends CrudRepository<Leerdoel, Long> {
}
