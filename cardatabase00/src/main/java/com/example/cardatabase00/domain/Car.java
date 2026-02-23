package com.example.cardatabase00.domain;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String brand;
    @NonNull
    private String model;
    @Nonnull
    private String color;
    @Nonnull
    private String registrationNumber;
    @Nonnull
    private int modelYear;
    @Nonnull
    private int price;

    @ManyToOne
    @JoinColumn(name = "owner")
    @Nonnull
    private Owner owner;

    public Car() {
    }

    public Car(@NonNull String brand, @NonNull String model, @Nonnull String color, @Nonnull String registrationNumber, int modelYear, int price, @Nonnull Owner owner) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.modelYear = modelYear;
        this.price = price;
        this.owner = owner;
    }
}
