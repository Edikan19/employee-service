package com.example.employee_service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class EmployeeControllerTest {

  private EmployeeManager manager;
  private EmployeeController controller;

  @BeforeEach
  void setUp() {
    manager = mock(EmployeeManager.class);
    controller = new EmployeeController(manager);
  }

  @Test
  void getEmployeesReturnsWhatTheManagerHolds() {
    Employees fake = new Employees();
    fake.setEmployeeList(List.of(new Employee("1", "Ada", "Obi", "a@example.com", "Engineer")));
    when(manager.getEmployees()).thenReturn(fake);

    Employees result = controller.getEmployees();

    assertSame(fake, result);
    assertEquals(1, result.getEmployeeList().size());
  }

  @Test
  void addEmployeeReturns201AndEchoesTheEmployee() {
    Employee incoming = new Employee("5", "Ngozi", "Eze", "n@example.com", "DevOps Engineer");

    ResponseEntity<Employee> response = controller.addEmployee(incoming);

    assertEquals(HttpStatus.CREATED, response.getStatusCode());
    assertSame(incoming, response.getBody());
  }

  @Test
  void addEmployeePassesTheEmployeeToTheManager() {
    Employee incoming = new Employee("5", "Ngozi", "Eze", "n@example.com", "DevOps Engineer");

    controller.addEmployee(incoming);

    verify(manager).addEmployee(incoming);
  }
}