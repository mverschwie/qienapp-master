package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.Leidinggevende;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;



public interface LeidinggevendeRepository extends CrudRepository <Leidinggevende, Long> {
}
