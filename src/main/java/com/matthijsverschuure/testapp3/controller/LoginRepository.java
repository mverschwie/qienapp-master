package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.Login;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface LoginRepository extends CrudRepository<Login, Long> {
}
