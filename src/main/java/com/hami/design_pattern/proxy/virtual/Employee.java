package com.hami.design_pattern.proxy.virtual;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Employee {

    private String employeeName;
    private double employeeSalary;
    private String employeeDesignation;
}
