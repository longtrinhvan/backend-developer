package com.webservice.dto.role;

import com.webservice.model.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    RoleDTO toDto(Role entity);
    
    Role toEntity(RoleDTO dto);

    List<RoleDTO> toDto(List<Role> entities);

    List<Role> toEntity(List<RoleDTO> dtos);

}
