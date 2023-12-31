package com.webservice.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.webservice.dto.role.RoleDTO;
import com.webservice.dto.role.RoleWithoutUsers;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;


@Data
public class UserDTO implements Serializable {

    public int useId;

    public String name;

    public LocalDate creationDate;

    public LocalDate lastLoginDate;

    public int isActived;

    public int isDeleted;

    public int age;

    public String email;

    public Integer status;

    public String password;

    public Collection<RoleWithoutUsers> roles;
}