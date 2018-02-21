package org.sample.usecases.restaurant.create;

import org.sample.entities.restaurant.Restaurant;
import org.sample.repositories.restaurant.contracts.RestaurantRepository;
import org.sample.usecases.restaurant.create.contracts.CreateRestaurant;
import org.sample.usecases.restaurant.create.contracts.CreateRestaurantRequest;
import org.sample.usecases.restaurant.create.contracts.CreateRestaurantResponse;

public class CreateRestaurantImp implements CreateRestaurant {

    private RestaurantRepository repository;

    @Override
    public void execute(CreateRestaurantRequest request, CreateRestaurantResponse response) {
        // TODO add validator
        Restaurant restaurant = asRestaurant(request);
        String id = repository.create(restaurant);
        response.response(id);
    }

    @Override
    public void setRestaurantRepository(RestaurantRepository repository) {
        this.repository = repository;
    }
    
    private Restaurant asRestaurant(CreateRestaurantRequest request) {
        Restaurant restaurant = new Restaurant();
        return restaurant;
    }

}
