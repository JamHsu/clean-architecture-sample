// Copyright (c) 1998-2018 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.6.0
// ============================================================================
// CHANGE LOG
// CNT.6.0 : 2018-XX-XX, jam.hsu, creation
// ============================================================================

package org.sample.spring.controller;

import org.sample.presentation.restaurant.create.CreateRestaurantPresenter;
import org.sample.presentation.restaurant.list.ListRestaurantPresenter;
import org.sample.spring.service.RestaurantService;
import org.sample.usecases.restaurant.create.contracts.CreateRestaurantRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jam.hsu
 *
 */
@RestController
public class RestaurantController {
    
    private final RestaurantService service;
    
    public RestaurantController(RestaurantService service) {
        this.service = service;
    }
    
    @GetMapping("/")
    public String listRestaurant() {
        ListRestaurantPresenter presenter = new ListRestaurantPresenter();
        service.listRestaurant(presenter);
        return presenter.createView().exportJson();
    }
    
    @PostMapping("/")
    public String createRestaurant(@RequestBody CreateRestaurantRequest restaurant) {
        CreateRestaurantPresenter presenter = new CreateRestaurantPresenter();
        CreateRestaurantRequest request = new CreateRestaurantRequest();
        service.createRestaurant(request, presenter);
        return presenter.createView().exportJson();
    }

}
