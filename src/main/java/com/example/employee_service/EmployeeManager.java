package com.example.employee_service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {

  private final Employees employees = new Employees();

  public EmployeeManager() {
    List<Employee> list = new ArrayList<>();
    list.add(new Employee("1", "Ada", "Obi", "ada.obi@example.com", "Software Engineer"));
    list.add(new Employee("2", "Emeka", "Okafor", "emeka.okafor@example.com", "Data Analyst"));
    list.add(new Employee("3", "Grace", "Etim", "grace.etim@example.com", "Project Manager"));
    list.add(new Employee("4", "Tunde", "Bello", "tunde.bello@example.com", "QA Engineer"));
    employees.setEmployeeList(list);
  }

  public Employees getEmployees() {
    return employees;
  }

  public void addEmployee(Employee employee) {
    employees.getEmployeeList().add(employee);
  }
}