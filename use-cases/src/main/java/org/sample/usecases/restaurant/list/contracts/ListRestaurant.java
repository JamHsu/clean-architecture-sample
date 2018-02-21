package org.sample.usecases.restaurant.list.contracts;

import org.sample.repositories.restaurant.contracts.RestaurantRepository;
import org.sample.usecase.contracts.UseCase;

public interface ListRestaurant extends UseCase<ListRestaurantRequest, ListRestaurantResponse> {
	void setRestaurantRepository(RestaurantRepository repository);
}
