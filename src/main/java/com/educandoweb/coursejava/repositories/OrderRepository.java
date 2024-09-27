package com.educandoweb.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursejava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}