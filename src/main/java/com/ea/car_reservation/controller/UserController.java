package com.ea.car_reservation.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ea.car_reservation.domain.User;
import com.ea.car_reservation.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public String registerUser(Model model, User user){
		userService.addUser(user);	
		return "home";
	}

}
