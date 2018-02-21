package org.sample.usecases.restaurant.create.contracts;

import org.sample.contracts.usecase.Response;

public interface CreateRestaurantResponse extends Response {
    void response(String restaurantId);
}
