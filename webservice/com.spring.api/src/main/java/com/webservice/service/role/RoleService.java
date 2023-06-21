package com.webservice.service.role;

import com.webservice.dto.role.RoleDTO;
import com.webservice.dto.role.RoleMapper;
import com.webservice.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleService implements IRoleService {

    private final RoleMapper roleMapper;
    private final IRoleRepository iroleRepository;

    @Autowired
    public RoleService(RoleMapper roleMapper, IRoleRepository iroleRepository) {
        this.roleMapper = roleMapper;
        this.iroleRepository = iroleRepository;
    }

    @Override
    public RoleDTO save(RoleDTO roledto) {
        var roleEntity = roleMapper.toEntity(roledto);
        var savedrole = iroleRepository.save(roleEntity);
        return roleMapper.toDto(savedrole);
    }

    @Override
    public RoleDTO getOne(int userID) {
        var userEntity = iroleRepository.findById(userID).orElse(null);
        return roleMapper.toDto(userEntity);
    }

    @Override
    public List<RoleDTO> findAlls() {
        var userList = iroleRepository.findAll();
        return userList.stream()
                .map(roleMapper::toDto)
                .collect(Collectors.toList());
    }
}
