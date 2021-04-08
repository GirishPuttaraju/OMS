package com.ms.aws.createorderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.aws.createorderservice.entity.Order;
import com.ms.aws.createorderservice.repository.CreateOrderRepository;

@RestController
public class CreateOrderController {

	@Autowired
	private CreateOrderRepository createOrderRepository;
	
	@GetMapping(value = "/order")
	public List<Order> getOrderDetails(){
				
		return createOrderRepository.getOrders();
		
	}
}
