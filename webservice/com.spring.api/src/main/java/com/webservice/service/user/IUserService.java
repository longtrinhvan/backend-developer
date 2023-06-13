package com.webservice.service.user;

import com.webservice.dto.user.UserDTO;

import java.util.List;

public interface IUserService {

    UserDTO save(UserDTO user);

    UserDTO getOne(int userID);

    List<UserDTO> findAlls();

}
