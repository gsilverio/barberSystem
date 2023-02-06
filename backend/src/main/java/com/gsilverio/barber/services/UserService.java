package com.gsilverio.barber.services;

import com.gsilverio.barber.dto.UserDTO;
import com.gsilverio.barber.entities.User;
import com.gsilverio.barber.repositories.UserRepository;
import com.gsilverio.barber.services.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Transactional(readOnly = true)
    public List<UserDTO> findAll(){
        List<User> list = userRepository.findAll();
        List<UserDTO> listDto = list.stream().map(x->new UserDTO(x)).collect(Collectors.toList());
        return listDto;
    }
    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
        Optional<User> obj = userRepository.findById(id);

        //orElseThrow lanca uma execao caso nao tenha uma entitadade no obj
        User entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
        return new UserDTO(entity);
    }
}