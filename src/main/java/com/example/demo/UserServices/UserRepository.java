package com.example.demo.UserServices;

import com.example.demo.users.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser, Integer> {
    Optional<AppUser> findAppUserByEmail(String email);
}
