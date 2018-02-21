package org.sample.usecases.restaurant.list.contracts;

import org.sample.contracts.usecase.UseCase;
import org.sample.repositories.restaurant.contracts.RestaurantRepository;

public interface ListRestaurant extends UseCase<ListRestaurantRequest, ListRestaurantResponse> {
	void setRestaurantRepository(RestaurantRepository repository);
}
