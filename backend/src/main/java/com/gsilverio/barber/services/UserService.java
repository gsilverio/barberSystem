package com.gsilverio.barber.services;

import com.gsilverio.barber.entities.User;
import com.gsilverio.barber.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Transactional(readOnly = true)
    public List<User> findAll(){
        return userRepository.findAll();
    }
}
