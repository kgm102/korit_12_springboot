package com.korit12.cardatabase.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
// Lombok을 의존성 주입화고, Car 클래스를 롬복 적용 버전으로 다 수정하시오.
// 이후 동일하게 localhost:8080/h2-console 을 통해서 접속에 성공하시오.
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String brand;
    @NonNull
    private String model;
    @NonNull
    private String color;
    @NonNull
    private String registrationNumber;
    @NonNull
    private int modelYear;
    @NonNull
    private int price;

    @ManyToOne
    @JoinColumn(name = "owner")
    @NonNull
    private Owner owner;                // NonNull이 없으니까 얘는 옵셔널이라고 봐야겠네요.

    public Car() {
    }

    public Car(@NonNull String brand, @NonNull String model, @NonNull String color, @NonNull String registrationNumber, @NonNull int modelYear, @NonNull int price, @NonNull Owner owner) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.modelYear = modelYear;
        this.price = price;
        this.owner = owner;
    }
}
