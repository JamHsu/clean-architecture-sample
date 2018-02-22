// Copyright (c) 1998-2018 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.6.0
// ============================================================================
// CHANGE LOG
// CNT.6.0 : 2018-XX-XX, jam.hsu, creation
// ============================================================================

package org.sample.usercases.restaurant.list;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.sample.entities.restaurant.Restaurant;
import org.sample.repositories.restaurant.contracts.RestaurantRepository;
import org.sample.usecases.restaurant.list.ListRestaurantImp;
import org.sample.usecases.restaurant.list.contracts.ListRestaurantRequest;
import org.sample.usecases.restaurant.list.contracts.ListRestaurantResponse;
import org.sample.usecases.restaurant.list.contracts.ListRestaurantResponseModel;

/**
 * @author jam.hsu
 *
 */
@RunWith(MockitoJUnitRunner.class)
class ListRestaurantImpTest {

    @Test
    void testExecute() {
        RestaurantRepository repository = Mockito.mock(RestaurantRepository.class);
        when(repository.findAll()).thenReturn(mockRestaurantList());
        
        ListRestaurantImp usecase = new ListRestaurantImp();
        usecase.setRestaurantRepository(repository);
        
        ListRestaurantRequest request = new ListRestaurantRequest();
        usecase.execute(request, new ListRestaurantResponse() {

			@Override
			public void response(
					List<ListRestaurantResponseModel.Restaurant> listRestaurant) {
				assertEquals(1, listRestaurant.size());
			}
            
        });
    }
    
    private List<Restaurant> mockRestaurantList() {
        List<Restaurant> restaurantList = new ArrayList<Restaurant>();
        Restaurant r = new Restaurant();
        r.setName("testName");
        restaurantList.add(r);
        return restaurantList;
    }

}
