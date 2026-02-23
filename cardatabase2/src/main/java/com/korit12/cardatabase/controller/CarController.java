//package com.korit12.cardatabase.controller;
//
//import com.korit12.cardatabase.domain.Car;
//import com.korit12.cardatabase.domain.CarRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//public class CarController {
//    private final CarRepository carRepository;
//
//    @GetMapping("/cars")
//    public List<Car> getCars() {
//        return carRepository.findAll();
//    }
//}
