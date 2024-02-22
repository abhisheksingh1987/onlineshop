package com.online.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.model.OrderRequest;
import com.online.service.OrderService;




@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/order")
	public ResponseEntity<String> createOder(@RequestBody OrderRequest orderRequest){
		orderService.createOrder(orderRequest);
		return ResponseEntity.ok("order create successfully");
	}
	
	

}
