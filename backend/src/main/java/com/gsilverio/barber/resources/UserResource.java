package com.gsilverio.barber.resources;

import com.gsilverio.barber.entities.User;
import org.apache.coyote.Response;
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
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> user = new ArrayList<>();
        user.add(new User(1L,"GUILHERME", "guilherme@gmail.com", "6296930508", LocalDate.of(1997,8,05),"12345"));
        user.add(new User(2L,"GUILHERME", "guilherme@gmail.com", "6296930508", LocalDate.of(1997,8,05),"12345"));
        return ResponseEntity.ok().body(user);
    }
}
