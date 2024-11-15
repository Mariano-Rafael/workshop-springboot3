package com.spring_curso.spring_curso.resources;

import com.spring_curso.spring_curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "MARIA", "MARIA@GMAIL>COM", "122121212", "1111111");

        return ResponseEntity.ok().body(u);
    }
}
