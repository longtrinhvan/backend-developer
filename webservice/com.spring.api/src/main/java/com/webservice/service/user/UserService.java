package com.webservice.service.user;

import com.google.common.base.Strings;
import com.webservice.dto.user.UserDTO;
import com.webservice.dto.user.UserMapper;
import com.webservice.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {

    private final UserMapper userMapper;
    private final IUserRepository iuserRepository;

    @Autowired
    public UserService(UserMapper userMapper, IUserRepository iuserRepository) {
        this.userMapper = userMapper;
        this.iuserRepository = iuserRepository;
    }

    @Override
    public UserDTO save(UserDTO user) {
        if (user != null && !Strings.isNullOrEmpty(user.getName()) && !Strings.isNullOrEmpty(user.getPassword())) {
            user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
            var userEntity = userMapper.toEntity(user);
            var savedUser = iuserRepository.save(userEntity);
            return userMapper.toDto(savedUser);
        }
        return null;
    }

    @Override
    public UserDTO getOne(int userID) {
        var userEntity = iuserRepository.findById(userID).orElse(null);
        return userMapper.toDto(userEntity);
    }

    @Override
    public List<UserDTO> findAlls() {
        var userList = iuserRepository.findAll();
        return userList.stream()
                .map(userMapper::toDto)
                .collect(Collectors.toList());
    }
}
