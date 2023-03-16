package com.transport.nelson.greg.transportation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transport.nelson.greg.transportation.model.Transport;

public interface TransportRepository extends JpaRepository<Transport, Long> {
}