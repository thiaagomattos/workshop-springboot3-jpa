package com.educandoweb.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursejava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}