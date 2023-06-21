package com.webservice.controller;

import com.webservice.dto.user.UserDTO;
import com.webservice.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Lazy
@RequestMapping("/test")
public class TestController {

    @Autowired
    private IUserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getOne(@PathVariable("id") final int userID) {
        HttpStatus httpStatus = HttpStatus.OK;
        UserDTO result = null;
        try {
            result = userService.getOne(userID);
        } catch (Throwable e) {
            e.printStackTrace();
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(result, httpStatus);
    }

    @GetMapping("/findalls")
    public ResponseEntity<List<UserDTO>> findAlls() {
        HttpStatus httpStatus = HttpStatus.OK;
        List<UserDTO> result = null;
        try {
            result = userService.findAlls();
        } catch (Throwable e) {
            e.printStackTrace();
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(result, httpStatus);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO user) {
        HttpStatus httpStatus = HttpStatus.CREATED;
        UserDTO result = null;
        try {
            result = userService.save(user);
        } catch (Throwable e) {
            e.printStackTrace();
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(result, httpStatus);
    }

}
