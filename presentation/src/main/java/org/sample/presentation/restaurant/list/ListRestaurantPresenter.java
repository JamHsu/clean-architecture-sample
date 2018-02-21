// Copyright (c) 1998-2018 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.6.0
// ============================================================================
// CHANGE LOG
// CNT.6.0 : 2018-XX-XX, jam.hsu, creation
// ============================================================================

package org.sample.presentation.restaurant.list;

import java.util.List;

import org.sample.entities.restaurant.Restaurant;
import org.sample.presentation.Presenter;
import org.sample.usecases.restaurant.list.contracts.ListRestaurantResponse;

/**
 * @author jam.hsu
 *
 */
public class ListRestaurantPresenter implements Presenter<ListRestaurantView>, ListRestaurantResponse {

    @Override
    public ListRestaurantView createView() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.sample.usecases.restaurant.list.contracts.ListRestaurantResponse#response(java.util.List)
     */
    @Override
    public void response(List<Restaurant> listRestaurant) {
        // TODO Auto-generated method stub
        
    }

}
