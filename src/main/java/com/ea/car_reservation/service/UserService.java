package com.ea.car_reservation.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ea.car_reservation.domain.User;
import com.ea.car_reservation.repository.UserRepositories;

@Transactional
@Service
public class UserService {
	
	@Autowired
	UserRepositories userRepositories;
	
	
	public User addUser(User user) {

		userRepositories.save(user);
		return user;
	}

}
