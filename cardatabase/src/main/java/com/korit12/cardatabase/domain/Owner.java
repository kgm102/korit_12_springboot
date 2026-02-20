package com.korit12.cardatabase.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ownerId;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    @Getter @Setter
    private List<Car> cars;

    public Owner() {
    }

    public Owner(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

