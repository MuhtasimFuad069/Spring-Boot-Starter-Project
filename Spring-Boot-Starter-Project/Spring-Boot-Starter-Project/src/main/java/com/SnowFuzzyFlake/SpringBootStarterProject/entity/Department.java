package com.SnowFuzzyFlake.SpringBootStarterProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long departmentId;

    @NotBlank(message = "Please Add Department Name")
    //@Length
    //@Size
    //@Email
    //@Positive
    //@Negative
    //@PositiveOrZero
    //@NegativeOrZero
    //@Future
    //@FutureOrPresent
    //@Past
    //@PastOrPresent
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}