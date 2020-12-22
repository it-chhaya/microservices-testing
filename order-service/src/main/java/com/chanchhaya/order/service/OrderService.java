package com.chanchhaya.order.service;

import java.util.List;

import com.chanchhaya.order.entity.Order;
import com.chanchhaya.order.repository.OrderRepository;
import com.chanchhaya.order.response.OrderRest;
import com.chanchhaya.order.response.ProductRest;
import com.chanchhaya.order.response.ResponseTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    
    private final RestTemplate restTemplate;
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(RestTemplate restTemplate ,OrderRepository orderRepository) {
        this.restTemplate = restTemplate;
        this.orderRepository = orderRepository;
    }

    public Order createNewOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public ResponseTemplate getOrderWithProductById(Long id) {

        ResponseTemplate responseTemplate = new ResponseTemplate();
        Order order = orderRepository.findById(id).orElseThrow();

        ProductRest productRest = restTemplate
                                    .getForObject("http://127.0.0.1:8000/product-rest/api/v1/products/" + order.getProductId(),
                                    ProductRest.class);

        responseTemplate.setOrder(order);
        responseTemplate.setProduct(productRest);

        return responseTemplate;

    }

}
