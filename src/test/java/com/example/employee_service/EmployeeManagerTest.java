package com.example.employee_service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeManagerTest {

  private EmployeeManager manager;

  @BeforeEach
  void setUp() {
    manager = new EmployeeManager();
  }

  @Test
  void startsWithFourHardCodedEmployees() {
    assertEquals(4, manager.getEmployees().getEmployeeList().size());
  }

  @Test
  void addEmployeeIncreasesTheListSize() {
    manager.addEmployee(new Employee("5", "Ngozi", "Eze", "ngozi.eze@example.com", "DevOps Engineer"));

    assertEquals(5, manager.getEmployees().getEmployeeList().size());
  }

  @Test
  void addedEmployeeIsStoredWithAllFields() {
    manager.addEmployee(new Employee("5", "Ngozi", "Eze", "ngozi.eze@example.com", "DevOps Engineer"));

    Employee added = manager.getEmployees().getEmployeeList().get(4);
    assertEquals("5", added.getEmployeeId());
    assertEquals("Ngozi", added.getFirstName());
    assertEquals("Eze", added.getLastName());
    assertEquals("ngozi.eze@example.com", added.getEmail());
    assertEquals("DevOps Engineer", added.getTitle());
  }
}