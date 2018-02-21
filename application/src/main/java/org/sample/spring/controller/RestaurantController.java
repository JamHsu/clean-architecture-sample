// Copyright (c) 1998-2018 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.6.0
// ============================================================================
// CHANGE LOG
// CNT.6.0 : 2018-XX-XX, jam.hsu, creation
// ============================================================================

package org.sample.spring.controller;

import org.sample.presentation.restaurant.list.ListRestaurantPresenter;
import org.sample.spring.service.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String home() {
        ListRestaurantPresenter presenter = new ListRestaurantPresenter();
        service.listRestaurant(presenter);
        return null;
    }

}
