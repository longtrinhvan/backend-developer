package com.webservice.dto.role;

import com.webservice.dto.user.UserWithoutRoles;
import lombok.Data;

import java.io.Serializable;
import java.util.Collection;

@Data
public class RoleDTO implements Serializable {

    public int id;

    public String name;

    public int isActived;

    public int isDeleted;

    public Collection<UserWithoutRoles> users;
}
