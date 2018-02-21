package org.sample.repositories.restaurant.contracts;

import org.sample.entities.restaurant.ContactInfo;

public interface ContactInfoRepository {
	void create(String restaurantId, ContactInfo contactInfo);
	ContactInfo find(String restaurantId);
}
