package org.sample.usecases.create.restaurant.contracts;

import org.sample.contracts.usecase.Request;

public class CreateRestaurantRequest implements Request{
	
	private String restaurantName;
	private CreateRestaurantRequestModel.Address address;
	private CreateRestaurantRequestModel.ContactInfo contactInfo;

}
