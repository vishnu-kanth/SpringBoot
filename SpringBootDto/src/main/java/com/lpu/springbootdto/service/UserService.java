package com.lpu.springbootdto.service;

import com.lpu.springbootdto.dto.UserRequestDTO;
import com.lpu.springbootdto.dto.UserResponseDTO;

public interface UserService {

    UserResponseDTO createUser(UserRequestDTO dto);
}