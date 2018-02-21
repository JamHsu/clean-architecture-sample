package org.sample.usecases.restaurant.create.contracts;

import org.sample.repositories.restaurant.contracts.RestaurantRepository;
import org.sample.usecase.contracts.UseCase;

public interface CreateRestaurant extends UseCase<CreateRestaurantRequest, CreateRestaurantResponse> {
    void setRestaurantRepository(RestaurantRepository repository);
}
