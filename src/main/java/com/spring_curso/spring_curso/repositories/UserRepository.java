package com.spring_curso.spring_curso.repositories;

import com.spring_curso.spring_curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
