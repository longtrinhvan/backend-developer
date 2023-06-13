package com.webservice.dto.user;

import com.webservice.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO toDto(User entity);

    User toEntity(UserDTO dto);

    List<UserDTO> toDto(List<User> entities);

    List<User> toEntity(List<UserDTO> dtos);

}
