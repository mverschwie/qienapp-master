package com.matthijsverschuure.testapp3.view;

import com.matthijsverschuure.testapp3.controller.LoginService;
import com.matthijsverschuure.testapp3.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/login")
public class LoginEndpoint {
    @Autowired
    LoginService loginService;


}



