package org.sample.entities.restaurant;

import org.sample.entities.Entity;

public class Address implements Entity {

	private static final long serialVersionUID = 4539320231910465762L;

	private String restaurantId;
	private String city;
	private String zone;
	private String address;

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String id) {
		this.restaurantId = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
