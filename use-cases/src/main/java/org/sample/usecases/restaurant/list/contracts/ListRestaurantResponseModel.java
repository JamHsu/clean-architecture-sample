// Copyright (c) 1998-2018 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.6.0
// ============================================================================
// CHANGE LOG
// CNT.6.0 : 2018-XX-XX, jam.hsu, creation
// ============================================================================

package org.sample.usecases.restaurant.list.contracts;

/**
 * @author jam.hsu
 *
 */
public interface ListRestaurantResponseModel {
    class Restaurant {
    		String restaurantId;
    		String restaurantName;
    		Address address;
    		ContactInfo contactInfo;
    		
    		public Restaurant(String id, String name, Address address, ContactInfo contactInfo) {
    			this.restaurantId = id;
    			this.restaurantName = name;
    			this.address = address;
    			this.contactInfo = contactInfo;
    		}
    		
    		public String getId() {
    			return restaurantId;
    		}
    		
    		public String getName() {
    			return restaurantName;
    		}
    		
    		public Address getAddress() {
    			return address;
    		}
    		
    		public ContactInfo getContactInfo() {
    			return contactInfo;
    		}
    }
    
    class Address {
        String zone;
        String city;
        String address;

        public Address(String zone, String city, String address) {
            this.zone = zone;
            this.city = city;
            this.address = address;
        }

        public String getZone() {
            return zone;
        }

        public String getCity() {
            return city;
        }

        public String getAddress() {
            return address;
        }
    }

    class ContactInfo {
        String phoneNumber;
        String email;

        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmail() {
            return email;
        }
    }

}
