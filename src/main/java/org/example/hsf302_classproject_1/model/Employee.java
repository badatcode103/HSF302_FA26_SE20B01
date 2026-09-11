package org.example.hsf302_classproject_1.model;

import jakarta.persistence.*;
import org.example.hsf302_classproject_1.model.enumPackage.Gender;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String email;

    private BigDecimal salary;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDate hireDate;

    private boolean active;

    private int yearOfService;

}
