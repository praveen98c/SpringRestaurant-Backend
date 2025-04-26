package com.home.restaurant.dto.model;

import java.math.BigDecimal;
import com.home.restaurant.model.enums.Cuisine;

public class FoodItemDTO {
	private Long id;
	private String name;
	private String description;
	private BigDecimal price;
	private BigDecimal rating;
	private Cuisine cuisine;
	private String imageUrl;

	public FoodItemDTO(Long id, String name, String description, BigDecimal price, BigDecimal rating, Cuisine cuisine, String imageUrl) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.rating = rating;
		this.cuisine = cuisine;
		this.imageUrl = imageUrl;
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

	public BigDecimal getRating() {
		return rating;
	}

	public Cuisine getCuisine() {
		return cuisine;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public Long getId() {
		return id;
	}
}
