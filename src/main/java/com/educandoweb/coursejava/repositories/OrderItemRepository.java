package com.educandoweb.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursejava.entities.OrderItem;
import com.educandoweb.coursejava.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {	

}