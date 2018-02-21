package org.sample.usecases.restaurant.create.contracts;

import org.sample.usecase.contracts.Response;

public interface CreateRestaurantResponse extends Response {
    void response(String restaurantId);
}
