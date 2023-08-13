package com.hami.design_pattern.proxy.virtual;

import java.util.List;

public class ContactListImpl implements ContactList{
    @Override
    public List<Employee> getEmpList() {
        System.out.println("Test");
        return getEmployeeList();
    }


    private List<Employee> getEmployeeList() {
        return List.of(
                Employee.builder()
                        .employeeName("Employee A")
                        .employeeSalary(2345.34)
                        .employeeDesignation("SE")
                        .build(),
                Employee.builder()
                        .employeeName("Employee B")
                        .employeeSalary(23456.42)
                        .employeeDesignation("Manager")
                        .build(),
                Employee.builder()
                        .employeeName("Employee C")
                        .employeeSalary(156.34)
                        .employeeDesignation("Manager")
                        .build(),
                Employee.builder()
                        .employeeName("Employee D")
                        .employeeSalary(1987.234)
                        .employeeDesignation("SSE")
                        .build(),
                Employee.builder()
                        .employeeName("Employee E")
                        .employeeSalary(56782.34)
                        .employeeDesignation("SSE")
                        .build()

        );
    }
}
