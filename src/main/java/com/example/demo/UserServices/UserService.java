package com.example.demo.UserServices;

import com.example.demo.users.AppUser;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    private UserRepository userRepository;
    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }

    public void addUser(AppUser user) {
        if(userRepository.findAppUserByEmail(user.getEmail()).isPresent()) {
            userRepository.save(user);
        }
    }

    protected void update(String status) {

    }
}
