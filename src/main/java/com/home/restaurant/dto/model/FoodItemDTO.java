package com.home.restaurant.dto.model;

import java.math.BigDecimal;
import com.home.restaurant.model.enums.Cuisine;

public class FoodItemDTO {

	private String name;
	private String description;
	private BigDecimal price;
	private BigDecimal rating;
	private Cuisine cuisine;

	public FoodItemDTO(String name, String description, BigDecimal price, BigDecimal rating, Cuisine cuisine) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.rating = rating;
		this.cuisine = cuisine;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public BigDecimal getRatings() {
		return rating;
	}

	public Cuisine getCuisine() {
		return cuisine;
	}
}
