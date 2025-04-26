package com.home.restaurant.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.home.restaurant.dto.model.FoodItemDTO;
import com.home.restaurant.exception.ResourceNotFoundException;
import com.home.restaurant.mapping.FoodItemMapping;
import com.home.restaurant.model.FoodItem;
import com.home.restaurant.repository.FoodItemRepository;
import com.home.restaurant.service.interfaces.FoodItemService;

@Service
public class FoodItemServiceImpl implements FoodItemService {

	private FoodItemRepository foodItemRepository;

	FoodItemServiceImpl(FoodItemRepository foodItemRepository) {
		this.foodItemRepository = foodItemRepository;
	}

	@Override
	public List<FoodItemDTO> getFoodItemsByMenuId(Long menuId) {
		List<FoodItem> menus = foodItemRepository.findByMenuId(menuId);
		return menus.stream().map(FoodItemMapping::toDTO).collect(Collectors.toList());
	}

	@Override
	public void updateFoodItemBy(Long id, Map<String, Object> updates) {
		FoodItem foodItem = foodItemRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("FoodItem not found with id " + id));
		updates.forEach((key, value) -> {
			switch (key) {
			case "rating":
				foodItem.setRating(new BigDecimal(value.toString()));
				break;
			default:
				throw new IllegalArgumentException("Unknown field: " + key);
			}
		});
		
		foodItemRepository.save(foodItem);
	}
}
