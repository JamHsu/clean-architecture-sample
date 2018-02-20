package org.sample.contracts.restaurant.repositories;

import org.sample.entities.restaurant.Address;

public interface AddressRepository {
	void create(String restaurantId, Address address);
	Address find(String restaurantId);
}
