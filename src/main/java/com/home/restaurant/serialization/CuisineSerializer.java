package com.home.restaurant.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.home.restaurant.model.enums.Cuisine;

import java.io.IOException;

public class CuisineSerializer extends JsonSerializer<Cuisine> {

	@Override
	public void serialize(Cuisine value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		gen.writeString(value.name().toLowerCase());
	}
}