package com.webservice.service.role;

import com.webservice.dto.role.RoleDTO;

import java.util.List;

public interface IRoleService {

    RoleDTO save(RoleDTO user);

    RoleDTO getOne(int userID);

    List<RoleDTO> findAlls();

}
