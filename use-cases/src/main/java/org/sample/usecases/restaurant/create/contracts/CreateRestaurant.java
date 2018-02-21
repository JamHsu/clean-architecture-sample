package org.sample.usecases.restaurant.create.contracts;

import org.sample.contracts.usecase.UseCase;
import org.sample.repositories.restaurant.contracts.AddressRepository;
import org.sample.repositories.restaurant.contracts.ContactInfoRepository;
import org.sample.repositories.restaurant.contracts.RestaurantRepository;

public interface CreateRestaurant extends UseCase<CreateRestaurantRequest, CreateRestaurantResponse> {
    void setRestaurantRepository(RestaurantRepository repository);

    void setAddressRepository(AddressRepository repository);

    void setAddressRepository(ContactInfoRepository repository);
}
