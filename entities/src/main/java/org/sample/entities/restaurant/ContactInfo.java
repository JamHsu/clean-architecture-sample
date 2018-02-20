package org.sample.entities.restaurant;

import org.sample.entities.Entity;

public class ContactInfo implements Entity {

	private static final long serialVersionUID = -181691308535976941L;
	
	private String restaurantId;
	private String phoneNumber;
	private String email;
	
	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
