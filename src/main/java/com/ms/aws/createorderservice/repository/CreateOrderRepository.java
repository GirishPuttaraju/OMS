package com.ms.aws.createorderservice.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.ms.aws.createorderservice.entity.Order;

@Repository
public class CreateOrderRepository {

	public List<Order> getOrders() {
		return Stream.of(
				new Order(101,"T-shirt","MEN",1,1500),
				new Order(102,"PUMA Shoe","WOMEN",2,5660)
				).collect(Collectors.toList());
	}

}
