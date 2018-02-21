package org.sample.usecases.restaurant.list;

import java.util.List;

import org.sample.entities.restaurant.Restaurant;
import org.sample.repositories.restaurant.contracts.AddressRepository;
import org.sample.repositories.restaurant.contracts.ContactInfoRepository;
import org.sample.repositories.restaurant.contracts.RestaurantRepository;
import org.sample.usecases.restaurant.list.contracts.ListRestaurant;
import org.sample.usecases.restaurant.list.contracts.ListRestaurantRequest;
import org.sample.usecases.restaurant.list.contracts.ListRestaurantResponse;

public class ListRestaurantImp implements ListRestaurant {

    private RestaurantRepository restaurantRespository;
    private AddressRepository addressRespository;
    private ContactInfoRepository contactInfoRespository;

    @Override
    public void execute(ListRestaurantRequest request, ListRestaurantResponse response) {
        List<Restaurant> listRestaurant = restaurantRespository.findAll();
        for (Restaurant restaurant : listRestaurant) {
            restaurant.setAddress(addressRespository.find(restaurant.getId()));
            restaurant.setContactInfo(contactInfoRespository.find(restaurant.getId()));
        }
        response.response(listRestaurant);
    }

    @Override
    public void setRestaurantRepository(RestaurantRepository repository) {
        this.restaurantRespository = repository;
    }

    @Override
    public void setAddressRepository(AddressRepository repository) {
        this.addressRespository = repository;
    }

    @Override
    public void setAddressRepository(ContactInfoRepository repository) {
        this.contactInfoRespository = repository;
    }

}
