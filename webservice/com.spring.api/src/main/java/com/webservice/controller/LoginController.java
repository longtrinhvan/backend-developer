package com.webservice.controller;

import com.webservice.model.authentication.LoginRequest;
import com.webservice.service.authentication.ILoginRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Lazy
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private ILoginRequestService iloginRequestService;

    @PostMapping("/login")
    public ResponseEntity<String> authenticateUser(@RequestBody LoginRequest loginRequest) {
        HttpStatus httpStatus = HttpStatus.OK;
        String result = "OK";
        try {
            iloginRequestService.authenticateUser(loginRequest);
        } catch (Throwable e) {
            e.printStackTrace();
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(result, httpStatus);
    }
}


