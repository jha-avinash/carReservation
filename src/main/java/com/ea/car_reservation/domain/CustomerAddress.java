package com.ea.car_reservation.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class CustomerAddress {

	@Id
	@GeneratedValue
	@Column (name = "id")
	private int id;
	
	@NotNull
	@Column (name="street")
	private String street;
	
	@NotNull
	@Column ( name = "city")
	
	private String City;
	@NotNull
	@Column ( name= "zip")
	private int zip;
	
	@NotNull
	@Column(name = "country")
	private String country;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
