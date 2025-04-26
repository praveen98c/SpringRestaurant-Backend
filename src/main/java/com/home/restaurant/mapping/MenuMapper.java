package com.home.restaurant.mapping;

import com.home.restaurant.dto.model.MenuDTO;
import com.home.restaurant.model.Menu;

public class MenuMapper {

	public static MenuDTO toDTO(Menu model) {
		return new MenuDTO(model.getId(), model.getName(), model.getDescription(), model.getRating(), model.getImageUrl());
	}
}
