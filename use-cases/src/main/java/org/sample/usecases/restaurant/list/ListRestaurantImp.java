package org.sample.usecases.restaurant.list;

import java.util.List;

import org.sample.entities.restaurant.Restaurant;
import org.sample.repositories.restaurant.contracts.RestaurantRepository;
import org.sample.usecases.restaurant.list.contracts.ListRestaurant;
import org.sample.usecases.restaurant.list.contracts.ListRestaurantRequest;
import org.sample.usecases.restaurant.list.contracts.ListRestaurantResponse;

public class ListRestaurantImp implements ListRestaurant {

    private RestaurantRepository repository;

    @Override
    public void execute(ListRestaurantRequest request, ListRestaurantResponse response) {
        List<Restaurant> listRestaurant = repository.findAll();
        response.response(listRestaurant);
    }

    @Override
    public void setRestaurantRepository(RestaurantRepository repository) {
        this.repository = repository;
    }

}
