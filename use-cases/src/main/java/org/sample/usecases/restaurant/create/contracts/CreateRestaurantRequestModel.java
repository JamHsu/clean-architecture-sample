package org.sample.usecases.restaurant.create.contracts;

public interface CreateRestaurantRequestModel {

    class Address {
        String zone;
        String city;
        String address;
        
        public Address() {}
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
        
        public ContactInfo() {}
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
