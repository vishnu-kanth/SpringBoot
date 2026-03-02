package com.lpu.springbootdto.Repository;

import com.lpu.springbootdto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}