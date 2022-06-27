package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Iterable<User> haalAlleUsers() {
        return userRepository.findAll();
    }
    public User nieuweUser(User user) {
        return userRepository.save(user);
    }

    public User haalUserBijID(long id) {
        if (userRepository.existsById(id)) {
            return userRepository.findById(id).get();
        }
        return null;

    }

    public void verwijderUserBijID(long id) {
        userRepository.deleteById(id);
    }


}