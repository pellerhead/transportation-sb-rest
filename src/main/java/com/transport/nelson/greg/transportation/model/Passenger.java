package com.transport.nelson.greg.transportation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "passenger")
@Data
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long passengerID;
   
    private String name;
    private String pin;
}
