package com.ea.car_reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ea.car_reservation.domain.Authority;
import com.ea.car_reservation.service.AuthorityService;

@Controller
public class AuthorityController {

	@Autowired
	AuthorityService authorityService;
	
	@RequestMapping(value="/addAuthority", method=RequestMethod.POST)
	@ResponseBody
	public String registerUser(Model model, Authority authority){
		authorityService.addAuthority(authority);
		return "Authority has been saved";
	}
}
