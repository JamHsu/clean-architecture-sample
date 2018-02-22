// Copyright (c) 1998-2018 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.6.0
// ============================================================================
// CHANGE LOG
// CNT.6.0 : 2018-XX-XX, jam.hsu, creation
// ============================================================================

package org.sample.presentation.restaurant.create;

import org.sample.presentation.JsonModel;
import org.sample.presentation.Presenter;
import org.sample.usecases.restaurant.create.contracts.CreateRestaurantResponse;

/**
 * @author jam.hsu
 *
 */
public class CreateRestaurantPresenter implements Presenter<CreateRestaurantView>, CreateRestaurantResponse {

    private JsonModel<String> dataModel;
    
    @Override
    public CreateRestaurantView createView() {
        CreateRestaurantView view = new CreateRestaurantView();
        view.setViewModel(dataModel);
        return view;
    }

    /* (non-Javadoc)
     * @see org.sample.usecases.restaurant.create.contracts.CreateRestaurantResponse#response(java.lang.String)
     */
    @Override
    public void response(String restaurantId) {
        this.dataModel = asJsonModel(restaurantId);
    }
    
    private JsonModel<String> asJsonModel(String id) {
        JsonModel<String> model = new JsonModel<String>();
        model.setData(id);
        return model;
}

}
