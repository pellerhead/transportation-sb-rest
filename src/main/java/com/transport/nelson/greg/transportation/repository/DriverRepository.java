package com.transport.nelson.greg.transportation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transport.nelson.greg.transportation.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}