package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entites.User;

public interface UserRepositry  extends JpaRepository<User, Long>{

}
