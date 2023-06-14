package com.example.orderservice.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemDto {
	private Long id;
	private String skuCode;
	private BigDecimal price;
	private Integer quantity;
}
