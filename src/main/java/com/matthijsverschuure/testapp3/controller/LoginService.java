package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginService {
    @Autowired
    LoginRepository loginRepository;

    public Iterable<Login> haalAlleLogins() {
        return loginRepository.findAll();
    }
    public Login nieuweLogin(Login login) {
        return loginRepository.save(login);
    }

    public Login haalLoginBijID(long id) {
        if (loginRepository.existsById(id)) {
            return loginRepository.findById(id).get();
        }
        return null;

    }

    public void verwijderLoginBijID(long id) {
        loginRepository.deleteById(id);
    }


}