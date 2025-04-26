package com.home.restaurant.model.enums;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.home.restaurant.serialization.CuisineSerializer; 

@JsonSerialize(using = CuisineSerializer.class)
public enum Cuisine {
	ENGLISH, CHINESE, AMERICAN, VIETNAMESE, MOROCCAN, FRENCH, THAI, JAPANESE, GREEK, INDIAN, MEXICAN, ITALIAN, SPANISH,
	KOREAN
}