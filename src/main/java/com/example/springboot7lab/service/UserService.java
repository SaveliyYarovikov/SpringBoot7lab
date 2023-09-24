package com.example.springboot7lab.service;

import com.example.springboot7lab.dto.UserDto;
import com.example.springboot7lab.entity.User;

import java.util.List;

public interface UserService {

    void saveUser (UserDto userDto);

    User findUserByEmail (String email);

    List<UserDto> findAllUsers();
}
