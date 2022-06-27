package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface UserRepository extends CrudRepository<User, Long> {
}
