// Copyright (c) 1998-2018 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.6.0
// ============================================================================
// CHANGE LOG
// CNT.6.0 : 2018-XX-XX, jam.hsu, creation
// ============================================================================

package org.sample.usercases.restaurant.create;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.sample.entities.restaurant.Restaurant;
import org.sample.repositories.restaurant.contracts.RestaurantRepository;
import org.sample.usecases.restaurant.create.CreateRestaurantImp;
import org.sample.usecases.restaurant.create.contracts.CreateRestaurantRequest;
import org.sample.usecases.restaurant.create.contracts.CreateRestaurantResponse;

/**
 * @author jam.hsu
 *
 */
class CreateRestaurantImpTest {

    /**
     * Test method for {@link org.sample.usecases.restaurant.create.CreateRestaurantImp#execute(org.sample.usecases.restaurant.create.contracts.CreateRestaurantRequest, org.sample.usecases.restaurant.create.contracts.CreateRestaurantResponse)}.
     */
    @Test
    void testExecute() {
        RestaurantRepository repository = Mockito.mock(RestaurantRepository.class);
        when(repository.create(any(Restaurant.class))).thenReturn("Restaurant-A");
        
        CreateRestaurantImp usecase = new CreateRestaurantImp();
        usecase.setRestaurantRepository(repository);
        CreateRestaurantRequest request = new CreateRestaurantRequest();
        usecase.execute(request, new CreateRestaurantResponse() {

            @Override
            public void response(String restaurantId) {
                assertEquals("Restaurant-A", restaurantId);
            }
            
        });
    }

}
