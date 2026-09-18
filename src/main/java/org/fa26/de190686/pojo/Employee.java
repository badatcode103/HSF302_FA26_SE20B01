package org.fa26.de190686.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    //•	Employee: id, fullName, salary (BigDecimal), hireDate (LocalDate),
    // email (unique, not null), gender (enum Gender { MALE, FEMALE, OTHER }), active (boolean, mặc định true).
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private BigDecimal salary;
    private LocalDate hireDate;
    private String email;
    private Gender gender;
    private boolean active = true;

    @ManyToMany
    @JoinTable(name = "employee_project",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))
    private Set<Project> projects = new HashSet<>();
}
