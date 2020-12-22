package com.chanchhaya.order.controller;

import java.util.List;

import com.chanchhaya.order.entity.Order;
import com.chanchhaya.order.response.ResponseTemplate;
import com.chanchhaya.order.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/orders")
public class OrderController {
    
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order createNewOrder(@RequestBody Order order) {
        return orderService.createNewOrder(order);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public ResponseTemplate getOrderWithProductById(@PathVariable("id") Long id) {
        return orderService.getOrderWithProductById(id);
    }

}
