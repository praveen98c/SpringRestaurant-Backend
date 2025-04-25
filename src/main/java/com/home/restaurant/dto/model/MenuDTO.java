package com.home.restaurant.dto.model;

import java.math.BigDecimal;

public class MenuDTO {
	private String name;
	private String description;
	private BigDecimal rating;
	
	public MenuDTO(String name, String description, BigDecimal rating) {
		this.name = name;
		this.description = description;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public BigDecimal getRating() {
		return rating;
	}
}
