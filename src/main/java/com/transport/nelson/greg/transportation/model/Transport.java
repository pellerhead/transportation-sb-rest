package com.transport.nelson.greg.transportation.model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "transport")
@Data
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transportID;

    private Long carID;
    private Long passengerID;
    private Long driverID;

    private Timestamp tripstart;
    private Timestamp tripstop;
}
