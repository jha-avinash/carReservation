package com.ea.car_reservation.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ea.car_reservation.domain.Authority;
import com.ea.car_reservation.repository.AuthorityRepositories;

@Transactional
@Service
public class AuthorityService {

	@Autowired
	AuthorityRepositories authorityRepositories;

	public Authority addAuthority(Authority authority) {

		authorityRepositories.save(authority);
		return authority;
	}
}
