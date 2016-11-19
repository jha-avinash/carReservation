package com.ea.car_reservation.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ea.car_reservation.domain.Customer;
import com.ea.car_reservation.repository.*;

@Transactional
@Service
public class CustomerService {

	@Autowired
	CustomerRepositories customerRepositories;

	public Customer addCustomer(Customer customer) {

		customerRepositories.save(customer);
		return customer;
	}

	// we might use this service for the admin part
	// which is a further extension if we get time
	public List<Customer> getCustomer() {
		return (List<Customer>) customerRepositories.findAll();

	}

}
