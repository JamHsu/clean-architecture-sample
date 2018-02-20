package org.sample.spring.service;

import org.sample.usecases.list.restaurant.ListRestaurantImp;
import org.sample.usecases.list.restaurant.contracts.ListRestaurant;
import org.sample.usecases.list.restaurant.contracts.ListRestaurantRequest;
import org.sample.usecases.list.restaurant.contracts.ListRestaurantResponse;

public class RestaurantService {
	
	private ListRestaurantResponse response;
	private ListRestaurant listRestaurant;
	
	public RestaurantService(ListRestaurantResponse response) {
		this.listRestaurant = new ListRestaurantImp();
		this.response = response;
	}
	
	public void listRestaurant() {
		ListRestaurantRequest request = new ListRestaurantRequest();
		listRestaurant.execute(request, response);
	}
	
}
