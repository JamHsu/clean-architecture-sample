// Copyright (c) 1998-2018 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.6.0
// ============================================================================
// CHANGE LOG
// CNT.6.0 : 2018-XX-XX, jam.hsu, creation
// ============================================================================

package org.sample.presentation.restaurant.list;

import java.util.List;

import org.sample.presentation.JsonModel;
import org.sample.presentation.Presenter;
import org.sample.usecases.restaurant.list.contracts.ListRestaurantResponse;
import org.sample.usecases.restaurant.list.contracts.ListRestaurantResponseModel.Restaurant;

/**
 * @author jam.hsu
 *
 */
public class ListRestaurantPresenter implements Presenter<ListRestaurantView>, ListRestaurantResponse {
	
	private JsonModel<List<Restaurant>> dataModel;

    @Override
    public ListRestaurantView createView() {
    		ListRestaurantView view = new ListRestaurantView();
    		view.setViewModel(dataModel);
        return view;
    }
    
    private JsonModel<List<Restaurant>> asJsonModel(List<Restaurant> listRestaurant) {
    		JsonModel<List<Restaurant>> model = new JsonModel<List<Restaurant>>();
    		model.setData(listRestaurant);
    		return model;
    }

    /* (non-Javadoc)
     * @see org.sample.usecases.restaurant.list.contracts.ListRestaurantResponse#response(java.util.List)
     */
    @Override
    public void response(List<Restaurant> listRestaurant) {
        this.dataModel = asJsonModel(listRestaurant);
    }

}
