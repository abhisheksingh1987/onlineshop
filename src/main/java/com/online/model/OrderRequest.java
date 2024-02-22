package com.online.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class OrderRequest{
	
@NotNull(message = "amount is required")
@Min(value = 1, message = "amount must be greater than zero")
private Double amount;

@NotBlank(message = "orderName is required")
@Pattern(regexp = "^[a-zA-Z]+$", message = "orderName should be alphabet only")
@Size(max = 200, message = "orderName length should not exceed 200 characters")
private String orderName;


public Double getAmount() {
   return amount;
}

public void setAmount(Double amount) {
   this.amount = amount;
}

public String getOrderName() {
   return orderName;
}

public void setOrderName(String orderName) {
   this.orderName = orderName;
}



}