package com.webservice.controller.admin;

import com.webservice.dto.role.RoleDTO;
import com.webservice.service.role.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Lazy
@RequestMapping("/admin/roles")
public class RoleAdminController {

    @Autowired
    private IRoleService iroleService;

    @GetMapping("/{id}")
    public ResponseEntity<RoleDTO> getOne(@PathVariable("id") final int roleID) {
        HttpStatus httpStatus = HttpStatus.OK;
        RoleDTO result = null;
        try {
            result = iroleService.getOne(roleID);
        } catch (Throwable e) {
            e.printStackTrace();
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(result, httpStatus);
    }

    @GetMapping("/findalls")
    public ResponseEntity<List<RoleDTO>> findAlls() {
        HttpStatus httpStatus = HttpStatus.OK;
        List<RoleDTO> result = null;
        try {
            result = iroleService.findAlls();
        } catch (Throwable e) {
            e.printStackTrace();
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(result, httpStatus);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<RoleDTO> createUser(@RequestBody RoleDTO roledto) {
        HttpStatus httpStatus = HttpStatus.CREATED;
        RoleDTO result = null;
        try {
            result = iroleService.save(roledto);
        } catch (Throwable e) {
            e.printStackTrace();
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(result, httpStatus);
    }

}
