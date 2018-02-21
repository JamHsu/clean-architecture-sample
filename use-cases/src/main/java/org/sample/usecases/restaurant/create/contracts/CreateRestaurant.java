package org.sample.usecases.restaurant.create.contracts;

import org.sample.contracts.usecase.UseCase;
import org.sample.repositories.restaurant.contracts.RestaurantRepository;

public interface CreateRestaurant extends UseCase<CreateRestaurantRequest, CreateRestaurantResponse> {
    void setRestaurantRepository(RestaurantRepository repository);
}
