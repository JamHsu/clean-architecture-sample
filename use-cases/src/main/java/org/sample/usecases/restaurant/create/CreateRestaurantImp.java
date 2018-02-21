package org.sample.usecases.restaurant.create;

import org.sample.repositories.restaurant.contracts.RestaurantRepository;
import org.sample.usecases.restaurant.create.contracts.CreateRestaurant;
import org.sample.usecases.restaurant.create.contracts.CreateRestaurantRequest;
import org.sample.usecases.restaurant.create.contracts.CreateRestaurantResponse;

public class CreateRestaurantImp implements CreateRestaurant {

    private RestaurantRepository restaurantRespository;

    @Override
    public void execute(CreateRestaurantRequest request, CreateRestaurantResponse response) {
        
    }

    @Override
    public void setRestaurantRepository(RestaurantRepository repository) {
        this.restaurantRespository = repository;
    }

}
