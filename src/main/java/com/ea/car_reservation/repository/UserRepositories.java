package com.ea.car_reservation.repository;

import org.springframework.data.repository.CrudRepository;

import com.ea.car_reservation.domain.User;

public interface UserRepositories extends CrudRepository<User, Integer>{

}
