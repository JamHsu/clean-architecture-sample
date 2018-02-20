package org.sample.usecases.list.restaurant.contracts;

import org.sample.contracts.restaurant.repositories.AddressRepository;
import org.sample.contracts.restaurant.repositories.ContactInfoRepository;
import org.sample.contracts.restaurant.repositories.RestaurantRepository;
import org.sample.contracts.usecase.UseCase;

public interface ListRestaurant extends UseCase<ListRestaurantRequest, ListRestaurantResponse> {
	void setRestaurantRepository(RestaurantRepository repository);
	void setAddressRepository(AddressRepository repository);
	void setAddressRepository(ContactInfoRepository repository);
}
