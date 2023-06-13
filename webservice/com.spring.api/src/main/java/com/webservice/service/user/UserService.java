package com.webservice.service.user;

import com.webservice.dto.user.UserDTO;
import com.webservice.dto.user.UserMapper;
import com.webservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO save(UserDTO user) {
        if (user == null) {
            return null;
        }
        var userEntity = userMapper.toEntity(user);
        var savedUser = userRepository.save(userEntity);
        return userMapper.toDto(savedUser);
    }

    @Override
    public UserDTO getOne(int userID) {
        var userEntity = userRepository.findById(userID).orElse(null);
        return userMapper.toDto(userEntity);
    }

    @Override
    public List<UserDTO> findAlls() {
        var userList = userRepository.findAll();
        return userList.stream()
                .map(userMapper::toDto)
                .collect(Collectors.toList());
    }
}
