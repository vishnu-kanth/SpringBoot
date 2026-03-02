package com.lpu.springbootdto.Controller;

import com.lpu.springbootdto.dto.UserRequestDTO;
import com.lpu.springbootdto.dto.UserResponseDTO;
import com.lpu.springbootdto.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public UserResponseDTO createUser(
            @Valid @RequestBody UserRequestDTO dto) {

        return service.createUser(dto);
    }
}