package com.transport.nelson.greg.transportation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transport.nelson.greg.transportation.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}