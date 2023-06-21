package com.webservice.controller;

import com.webservice.service.email.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Lazy
@RequestMapping("/home/verification")
public class VerificationController {

    @Autowired
    private IEmailService iemailService;

    @PostMapping("/verification")
    public ResponseEntity<String> sendVerificationEmail(@RequestParam String to) {
        HttpStatus httpStatus = HttpStatus.OK;
        String result = null;
        try {
            result = iemailService.sendVerificationEmail(to);
        } catch (Throwable e) {
            e.printStackTrace();
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(result, httpStatus);
    }
}

