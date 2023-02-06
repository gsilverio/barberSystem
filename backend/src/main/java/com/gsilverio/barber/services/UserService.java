package com.gsilverio.barber.services;

import com.gsilverio.barber.dto.UserDTO;
import com.gsilverio.barber.entities.User;
import com.gsilverio.barber.repositories.UserRepository;
import com.gsilverio.barber.services.exceptions.DataBaseExeption;
import com.gsilverio.barber.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        User entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new UserDTO(entity);
    }
    @Transactional
    public UserDTO insert(UserDTO dto) {
        User entity = new User();
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setPhone(dto.getPhone());
        entity.setPassword(dto.getPassword());
        entity = userRepository.save(entity);
        return new UserDTO((entity));    }
    @Transactional
    public UserDTO update(Long id, UserDTO dto) {
        try {
            User entity = userRepository.getReferenceById(id);
            entity.setName(dto.getName());
            entity.setEmail(dto.getEmail());
            entity.setPhone(dto.getPhone());
            entity.setPassword(dto.getPassword());
            entity = userRepository.save(entity);
            return new UserDTO((entity));
        } catch(EntityNotFoundException e){
            throw new ResourceNotFoundException("Id not found " + id);
        }

    }

    public void delete(Long id) {
        try {
            userRepository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException("Id not found " + id);
        }catch (DataIntegrityViolationException e){
            throw new DataBaseExeption("Integrity violation");
        }
    }
}
