package com.home.restaurant.dto.model;

import java.math.BigDecimal;

public class MenuDTO {
	private Long id;
	private String name;
	private String description;
	private BigDecimal rating;
	private String imageUrl;
	
	public MenuDTO(Long id, String name, String description, BigDecimal rating, String imageUrl) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.rating = rating;
		this.imageUrl = imageUrl;
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

	public String getImageUrl() {
		return imageUrl;
	}

	public Long getId() {
		return id;
	}
}
