package com.webservice.dto.user;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;


@Data
public class UserDTO implements Serializable {

    public int useId;

    public String name;

    public LocalDate creationDate;

    public LocalDate lastLoginDate;

    public boolean active;

    public int age;

    public String email;

    public Integer status;
}