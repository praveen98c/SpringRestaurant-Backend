package com.home.restaurant.mapping;

import com.home.restaurant.dto.model.FoodItemDTO;
import com.home.restaurant.model.FoodItem;

public class FoodItemMapping {

	public static FoodItemDTO toDTO(FoodItem model) {
		return new FoodItemDTO(model.getId(), model.getName(), model.getDescription(), model.getPrice(), model.getRating(),
				model.getCuisine(), model.getImageUrl());
	}
}
