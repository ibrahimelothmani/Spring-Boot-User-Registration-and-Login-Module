package com.ibrahim.jwt.service;

import com.ibrahim.jwt.domain.User;
import com.ibrahim.jwt.dto.UserDto;

import java.util.List;

public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
