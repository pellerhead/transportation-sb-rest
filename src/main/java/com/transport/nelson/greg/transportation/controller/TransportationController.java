package com.transport.nelson.greg.transportation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.transport.nelson.greg.transportation.model.Car;

import com.transport.nelson.greg.transportation.repository.CarRepository;

import jakarta.persistence.EntityNotFoundException;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/mylearning/transportation")
public class TransportationController {

  @Autowired
  CarRepository carRepository;

  @GetMapping("/car")
  public ResponseEntity<List<Car>> getAllCars(@RequestParam(required = false) Long id) {
    try {
      List<Car> cars = new ArrayList<>();

      Car c = new Car();

      if (id == null)
        carRepository.findAll().forEach(cars::add);
      else {
        c = carRepository.findById(id).orElse(null);
        cars.add(c);
        return (ResponseEntity<List<Car>>) cars;
      }
      
      if (cars.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }

      return new ResponseEntity<>(cars, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

}
