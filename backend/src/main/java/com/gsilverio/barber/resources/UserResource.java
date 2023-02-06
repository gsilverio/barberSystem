package com.gsilverio.barber.resources;

import com.gsilverio.barber.dto.UserDTO;
import com.gsilverio.barber.entities.User;
import com.gsilverio.barber.services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {
    @Autowired
    private UserService userService;
    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll(){
        List<UserDTO> user = userService.findAll();
        return ResponseEntity.ok().body(user);
    }
    @GetMapping(value="/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id){
        UserDTO dto = userService.findById(id);
        return ResponseEntity.ok().body(dto);
    }
}
