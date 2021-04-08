package com.ms.aws.createorderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {

	private int id;
	private String orderName;
	private String orderType;
	private int qty;
	private long price;
}
