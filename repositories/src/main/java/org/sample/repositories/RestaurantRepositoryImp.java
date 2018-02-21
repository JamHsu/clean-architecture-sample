// Copyright (c) 1998-2018 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.6.0
// ============================================================================
// CHANGE LOG
// CNT.6.0 : 2018-XX-XX, jam.hsu, creation
// ============================================================================

package org.sample.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.sample.entities.restaurant.Address;
import org.sample.entities.restaurant.ContactInfo;
import org.sample.entities.restaurant.Restaurant;
import org.sample.repositories.restaurant.contracts.RestaurantRepository;

/**
 * @author jam.hsu
 *
 */
public class RestaurantRepositoryImp implements RestaurantRepository {
    
    private Map<String, Restaurant> restaurantData = new HashMap<String, Restaurant>();

    public RestaurantRepositoryImp() {
        initData();
    }
    
    private void initData() {
        String r1UUid = UUID.randomUUID().toString();
        Restaurant r1 = new Restaurant();
        r1.setId(r1UUid);
        r1.setName("CBX");
        Address a1 = new Address();
        a1.setRestaurantId(r1UUid);
        a1.setCity("Mong Kok");
        a1.setZone("HK");
        a1.setAddress("Address");
        ContactInfo c1 = new ContactInfo();
        c1.setEmail("CBX@mail.com");
        c1.setPhoneNumber("123456789");
        r1.setAddress(a1);
        r1.setContactInfo(c1);
        restaurantData.put(r1UUid, r1);
        
        String r2UUid = UUID.randomUUID().toString();
        Restaurant r2 = new Restaurant();
        r2.setId(r2UUid);
        r2.setName("CBX_TW");
        Address a2 = new Address();
        a2.setRestaurantId(r1UUid);
        a2.setCity("Taipei");
        a2.setZone("Taiwan");
        a2.setAddress("Taipei Address");
        ContactInfo c2 = new ContactInfo();
        c2.setEmail("CBX_TW@mail.com");
        c2.setPhoneNumber("123456789");
        r2.setAddress(a2);
        r2.setContactInfo(c2);
        restaurantData.put(r2UUid, r2);
    }
    
    @Override
    public String create(Restaurant restaurant) {
        String uuid = UUID.randomUUID().toString();
        restaurantData.put(uuid, restaurant);
        return uuid;
    }
    

    /* (non-Javadoc)
     * @see org.sample.repositories.restaurant.contracts.RestaurantRepository#findAll()
     */
    @Override
    public List<Restaurant> findAll() {
        return new ArrayList<Restaurant>(restaurantData.values());
    }

}
