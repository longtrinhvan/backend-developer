package com.webservice.dto.user;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class UserWithoutRoles implements Serializable {

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
}
