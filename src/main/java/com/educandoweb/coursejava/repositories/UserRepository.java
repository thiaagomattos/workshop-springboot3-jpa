package com.educandoweb.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursejava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}