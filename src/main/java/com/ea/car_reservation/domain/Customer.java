package com.ea.car_reservation.domain;

import javax.persistence.*;


import org.hibernate.validator.constraints.Email;
//import javax.validation.constraints.NotNull;

@Entity
@Table ( name ="Customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;
	
	@Column (name = "name")
	private String customerName;
	
	private String phone;
	
	@Email
	private String email;
	
	@OneToOne
	@JoinColumn (name = "address")
	private CustomerAddress address;
	
	@OneToOne
	@JoinColumn ( name = "user_Id")
	private User user;

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CustomerAddress getAddress() {
		return address;
	}

	public void setAddress(CustomerAddress address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
		
}
