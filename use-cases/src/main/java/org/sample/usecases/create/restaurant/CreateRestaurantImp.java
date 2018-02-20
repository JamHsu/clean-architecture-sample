package org.sample.usecases.create.restaurant;

import org.sample.contracts.restaurant.repositories.AddressRepository;
import org.sample.contracts.restaurant.repositories.ContactInfoRepository;
import org.sample.contracts.restaurant.repositories.RestaurantRepository;
import org.sample.usecases.create.restaurant.contracts.CreateRestaurant;
import org.sample.usecases.create.restaurant.contracts.CreateRestaurantRequest;
import org.sample.usecases.create.restaurant.contracts.CreateRestaurantResponse;

public class CreateRestaurantImp implements CreateRestaurant {

	private RestaurantRepository restaurantRespository;
	private AddressRepository addressRespository;
	private ContactInfoRepository contactInfoRespository;

	@Override
	public void execute(CreateRestaurantRequest request, CreateRestaurantResponse response) {
		// TODO Auto-generated method stub

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
