package com.webservice.controller;

import com.webservice.dto.user.UserDTO;
import com.webservice.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getOne(int userID) {
        HttpStatus httpStatus = HttpStatus.ACCEPTED;
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
        HttpStatus httpStatus = HttpStatus.ACCEPTED;
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
