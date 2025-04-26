package com.home.restaurant.service.interfaces;

import java.util.List;
import java.util.Map;

import com.home.restaurant.dto.model.FoodItemDTO;

public interface FoodItemService {
	public List<FoodItemDTO> getFoodItemsByMenuId(Long menuId);
	public void updateFoodItemBy(Long id, Map<String, Object> updates);
}
