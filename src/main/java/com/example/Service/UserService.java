package com.example.Service;

import com.example.Models.User;
import com.example.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User SaveUser(User user)
    {
        return this.userRepository.save(user);
    }

    public boolean deleteUser(long id)
    {
        this.userRepository.deleteById(id);
        return this.userRepository.existsById(id);
    }
}
