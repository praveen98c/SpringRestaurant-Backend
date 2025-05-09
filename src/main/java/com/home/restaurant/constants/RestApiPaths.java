package com.home.restaurant.constants;

public class RestApiPaths {
	
	public static class PathVariables {
		public static final String ID = "id";
	}

	public static class Auth {
		public static final String BASE = "/api/auth";
		public static final String LOGIN = "/login";
		public static final String REGISTER = "/register";
	}
	
	public static class Restaurants {
		public static final String BASE = "/api/restaurants";
		public static final String RESTAURANT_BY_ID = "/{" + PathVariables.ID + "}";
	}
	
	public static class Menus {
		public static final String BASE = "/api/menus";
		public static final String RESTAURANT_BY_ID = "/restaurant/{" + PathVariables.ID + "}";
	}
	
	public static class FoodItems {
		public static final String BASE = "/api/fooditems";
		public static final String FOODITEM_BY_ID = "/{" + PathVariables.ID + "}";
		public static final String MENU_BY_ID = "/menu/{" + PathVariables.ID + "}";
	}
}
