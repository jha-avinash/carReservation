package com.ea.car_reservation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ea.car_reservation.domain.Authority;

@Repository
public interface AuthorityRepositories extends CrudRepository<Authority, Integer> {

}
