package org.sample.contracts.restaurant.repositories;

import java.util.List;

import org.sample.entities.restaurant.Restaurant;

public interface RestaurantRepository {
	String create(Restaurant restaurant);
	List<Restaurant> findAll();
}
