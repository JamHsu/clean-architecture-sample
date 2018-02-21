package org.sample.usecases.restaurant.list.contracts;

import java.util.List;

import org.sample.usecase.contracts.Response;
import org.sample.usecases.restaurant.list.contracts.ListRestaurantResponseModel.Restaurant;

public interface ListRestaurantResponse extends Response {
	void response(List<Restaurant> listRestaurant);
}
