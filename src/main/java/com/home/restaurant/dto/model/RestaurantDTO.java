package com.home.restaurant.dto.model;

import java.math.BigDecimal;

public class RestaurantDTO {
	private Long id;
	private String name;
	private String location;
	private BigDecimal rating;
	private String imageUrl;

	public RestaurantDTO(Long id, String name, String location, BigDecimal rating, String imageUrl) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.imageUrl  = imageUrl;
	}

	public String getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public BigDecimal getRating() {
		return rating;
	}
}
