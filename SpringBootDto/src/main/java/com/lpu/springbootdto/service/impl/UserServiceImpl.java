package com.lpu.springbootdto.service.impl;

import com.lpu.springbootdto.dto.UserRequestDTO;
import com.lpu.springbootdto.dto.UserResponseDTO;
import com.lpu.springbootdto.entity.User;
import com.lpu.springbootdto.Mapper.UserMapper;
import com.lpu.springbootdto.Repository.UserRepository;
import com.lpu.springbootdto.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    public UserServiceImpl(UserRepository repository, UserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public UserResponseDTO createUser(UserRequestDTO dto) {

        User user = mapper.toEntity(dto);

        User savedUser = repository.save(user);

        return mapper.toDTO(savedUser);
    }
}