package com.example.cardatabase00.domain;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ownerId;

    @Nonnull
    private String firstName;

    @Nonnull
    private String lastName;



    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private List<Car> cars;
    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Owner() {
    }

    public Owner(@Nonnull String firstName, @Nonnull String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
