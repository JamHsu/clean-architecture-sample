package org.sample.usecases.restaurant.create;

import org.sample.entities.restaurant.Address;
import org.sample.entities.restaurant.ContactInfo;
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
        Address address = new Address();
        address.setCity(request.getAddress().getCity());
        address.setZone(request.getAddress().getZone());
        address.setAddress(request.getAddress().getAddress());
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setEmail(request.getContactInfo().getEmail());
        contactInfo.setPhoneNumber(request.getContactInfo().getPhoneNumber());
        restaurant.setAddress(address);
        restaurant.setContactInfo(contactInfo);
        
        return restaurant;
    }

}
