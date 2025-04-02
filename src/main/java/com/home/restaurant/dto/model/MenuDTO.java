package com.home.restaurant.dto.model;

public class MenuDTO {
	private String name;
	private String description;
	
	public MenuDTO(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
}
