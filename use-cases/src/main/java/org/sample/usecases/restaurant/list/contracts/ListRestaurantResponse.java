package org.sample.usecases.restaurant.list.contracts;

import java.util.List;

import org.sample.entities.restaurant.Restaurant;
import org.sample.usecase.contracts.Response;

public interface ListRestaurantResponse extends Response {
	void response(List<Restaurant> listRestaurant);
}
