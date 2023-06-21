package com.webservice.dto.role;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoleWithoutUsers implements Serializable {

    public int id;

    public String name;

    public int isActived;

    public int isDeleted;
}
