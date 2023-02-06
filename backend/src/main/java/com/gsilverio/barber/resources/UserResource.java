package com.gsilverio.barber.resources;

import com.gsilverio.barber.dto.UserDTO;
import com.gsilverio.barber.entities.User;
import com.gsilverio.barber.services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {
    @Autowired
    private UserService userService;
    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll(){
        List<UserDTO> user = userService.findAll();
        return ResponseEntity.ok().body(user);
    }
}
