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
@Table(name = "projects")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    //•	Project: id, projectCode (unique), projectName,
    // budget (BigDecimal), startDate (LocalDate), endDate (LocalDate, có thể null nếu dự án chưa kết thúc).
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectCode;
    private String projectName;
    private BigDecimal budget;
    private LocalDate startDate;
    private LocalDate endDate;

    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees = new HashSet<>();
}
