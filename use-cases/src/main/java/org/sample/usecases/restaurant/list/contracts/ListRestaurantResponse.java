package org.sample.usecases.restaurant.list.contracts;

import java.util.List;

import org.sample.contracts.usecase.Response;
import org.sample.entities.restaurant.Restaurant;

public interface ListRestaurantResponse extends Response {
	void response(List<Restaurant> listRestaurant);
}
