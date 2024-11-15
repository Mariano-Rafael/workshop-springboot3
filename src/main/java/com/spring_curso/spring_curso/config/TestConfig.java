package com.spring_curso.spring_curso.config;

import com.spring_curso.spring_curso.entities.User;
import com.spring_curso.spring_curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {


    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "Xp8l1@example.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "Ht5s2@example.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
