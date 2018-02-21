package org.sample.usecases.restaurant.create;

import org.sample.repositories.restaurant.contracts.AddressRepository;
import org.sample.repositories.restaurant.contracts.ContactInfoRepository;
import org.sample.repositories.restaurant.contracts.RestaurantRepository;
import org.sample.usecases.restaurant.create.contracts.CreateRestaurant;
import org.sample.usecases.restaurant.create.contracts.CreateRestaurantRequest;
import org.sample.usecases.restaurant.create.contracts.CreateRestaurantResponse;

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
