package com.educandoweb.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursejava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}