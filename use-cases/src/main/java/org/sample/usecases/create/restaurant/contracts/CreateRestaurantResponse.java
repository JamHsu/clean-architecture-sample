package org.sample.usecases.create.restaurant.contracts;

import org.sample.contracts.usecase.Response;

public interface CreateRestaurantResponse extends Response {
	void response(String restaurantId);
}
