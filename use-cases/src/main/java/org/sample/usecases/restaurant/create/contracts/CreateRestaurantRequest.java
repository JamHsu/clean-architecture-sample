package org.sample.usecases.restaurant.create.contracts;

import org.sample.contracts.usecase.Request;

public class CreateRestaurantRequest implements Request {

    private String restaurantName;
    private CreateRestaurantRequestModel.Address address;
    private CreateRestaurantRequestModel.ContactInfo contactInfo;

    /**
     * @return the restaurantName
     */
    public String getRestaurantName() {
        return restaurantName;
    }

    /**
     * @param restaurantName
     *            the restaurantName to set
     */
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    /**
     * @return the address
     */
    public CreateRestaurantRequestModel.Address getAddress() {
        return address;
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress(CreateRestaurantRequestModel.Address address) {
        this.address = address;
    }

    /**
     * @return the contactInfo
     */
    public CreateRestaurantRequestModel.ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * @param contactInfo
     *            the contactInfo to set
     */
    public void setContactInfo(CreateRestaurantRequestModel.ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

}
