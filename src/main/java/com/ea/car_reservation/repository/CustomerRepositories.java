package com.ea.car_reservation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ea.car_reservation.domain.Customer;

@Repository
public interface CustomerRepositories extends CrudRepository<Customer, Integer>{

}
