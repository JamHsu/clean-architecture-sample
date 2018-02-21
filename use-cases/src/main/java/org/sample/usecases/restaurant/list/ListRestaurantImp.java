package org.sample.usecases.restaurant.list;

import java.util.ArrayList;
import java.util.List;

import org.sample.entities.restaurant.Address;
import org.sample.entities.restaurant.ContactInfo;
import org.sample.entities.restaurant.Restaurant;
import org.sample.repositories.restaurant.contracts.RestaurantRepository;
import org.sample.usecases.restaurant.list.contracts.ListRestaurant;
import org.sample.usecases.restaurant.list.contracts.ListRestaurantRequest;
import org.sample.usecases.restaurant.list.contracts.ListRestaurantResponse;
import org.sample.usecases.restaurant.list.contracts.ListRestaurantResponseModel;

public class ListRestaurantImp implements ListRestaurant {

    private RestaurantRepository repository;

    @Override
    public void execute(ListRestaurantRequest request, ListRestaurantResponse response) {
        List<Restaurant> listRestaurant = repository.findAll();
        List<ListRestaurantResponseModel.Restaurant> responseRestaurantList = asResponseType(listRestaurant);
        response.response(responseRestaurantList);
    }
    
    private List<ListRestaurantResponseModel.Restaurant> asResponseType(List<Restaurant> listRestaurant) {
    		List<ListRestaurantResponseModel.Restaurant> responseRestaurantList = new ArrayList<ListRestaurantResponseModel.Restaurant>();
    		for (Restaurant r : listRestaurant) {
    			ListRestaurantResponseModel.Address ra = asResponseAddress(r.getAddress());
    			ListRestaurantResponseModel.ContactInfo rc = asResponseContactInfo(r.getContactInfo());
			ListRestaurantResponseModel.Restaurant rr = new ListRestaurantResponseModel.Restaurant(r.getId(),
					r.getName(), ra, rc);
			responseRestaurantList.add(rr);
    		}
    		return responseRestaurantList;
    }
    
    private ListRestaurantResponseModel.Address asResponseAddress(Address address) {
    		return new ListRestaurantResponseModel.Address(address.getZone(), address.getCity(), address.getAddress());
    }
    
    private ListRestaurantResponseModel.ContactInfo asResponseContactInfo(ContactInfo contactInfo) {
    		return new ListRestaurantResponseModel.ContactInfo(contactInfo.getPhoneNumber(), contactInfo.getEmail());
    }

    @Override
    public void setRestaurantRepository(RestaurantRepository repository) {
        this.repository = repository;
    }

}
