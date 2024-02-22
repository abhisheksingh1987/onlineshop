package com.online.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.entity.Order;
import com.online.model.OrderRequest;
import com.online.repository.OrderRepository;
import com.online.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository oderRepository;
	
	@Override
	public void createOrder(OrderRequest orderRequest) {
		Order order = convertModelToEntity(orderRequest);
		oderRepository.save(order);
		
	}
 private static Order convertModelToEntity(OrderRequest orderRequest) {
	
	 Order order = new Order();
	 order.setAmount(orderRequest.getAmount());
	 order.setOrderName(orderRequest.getOrderName());
	 return order;
	 
 }
}
