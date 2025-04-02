package com.home.restaurant.mapping;

import com.home.restaurant.dto.model.RestaurantDTO;
import com.home.restaurant.model.Restaurant;

public class RestaurantMappper {

	public static RestaurantDTO toDTO(Restaurant model) {
		return new RestaurantDTO(model.getId(), model.getName(), model.getLocation(), model.getImageUrl());
	}
}
