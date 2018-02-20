package org.sample.usecases.list.restaurant;

import java.util.List;

import org.sample.contracts.restaurant.repositories.AddressRepository;
import org.sample.contracts.restaurant.repositories.ContactInfoRepository;
import org.sample.contracts.restaurant.repositories.RestaurantRepository;
import org.sample.entities.restaurant.Restaurant;
import org.sample.usecases.list.restaurant.contracts.ListRestaurant;
import org.sample.usecases.list.restaurant.contracts.ListRestaurantRequest;
import org.sample.usecases.list.restaurant.contracts.ListRestaurantResponse;

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
