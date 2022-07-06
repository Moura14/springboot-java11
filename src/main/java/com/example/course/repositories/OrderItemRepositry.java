package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entites.OrderItem;

public interface OrderItemRepositry  extends JpaRepository<OrderItem, Long>{

}
