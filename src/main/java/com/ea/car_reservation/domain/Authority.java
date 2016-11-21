package com.ea.car_reservation.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Authority {

	@Id
	@GeneratedValue
	private int id;
	
	private String role = "user";
	
//	@OneToOne
//	@JoinColumn
//	private User user;
	
	public int getId() {
		return id;
	}
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
