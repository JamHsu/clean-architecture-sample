package org.sample.spring.service;

import org.sample.presentation.restaurant.list.ListRestaurantPresenter;
//import org.sample.presentation.restaurant.create.CreateRestaurantPresenter;
import org.sample.repositories.RestaurantRepositoryImp;
import org.sample.usecases.restaurant.create.CreateRestaurantImp;
import org.sample.usecases.restaurant.create.contracts.CreateRestaurant;
import org.sample.usecases.restaurant.create.contracts.CreateRestaurantRequest;
import org.sample.usecases.restaurant.list.ListRestaurantImp;
import org.sample.usecases.restaurant.list.contracts.ListRestaurant;
import org.sample.usecases.restaurant.list.contracts.ListRestaurantRequest;
import org.sample.usecases.restaurant.list.contracts.ListRestaurantResponse;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
	
	private ListRestaurant listRestaurant;
	private CreateRestaurant createRestaurant;
	
	public RestaurantService() {
		this.listRestaurant = new ListRestaurantImp();
		this.listRestaurant.setRestaurantRepository(new RestaurantRepositoryImp());
		this.createRestaurant = new CreateRestaurantImp();
		this.createRestaurant.setRestaurantRepository(new RestaurantRepositoryImp());
	}
	
	public void listRestaurant(ListRestaurantPresenter presenter) {
		ListRestaurantRequest request = new ListRestaurantRequest();
		listRestaurant.execute(request, presenter);
	}
	
//	public void createRestaurant(CreateRestaurantRequest request, CreateRestaurantPresenter presenter) {
//	    createRestaurant.execute(request, presenter);
//	}
	
}
