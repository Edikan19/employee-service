package com.example.employee_service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class EmployeeTest {

  @Test
  void constructorSetsAllFields() {
    Employee e = new Employee("1", "Ada", "Obi", "ada.obi@example.com", "Software Engineer");

    assertEquals("1", e.getEmployeeId());
    assertEquals("Ada", e.getFirstName());
    assertEquals("Obi", e.getLastName());
    assertEquals("ada.obi@example.com", e.getEmail());
    assertEquals("Software Engineer", e.getTitle());
  }

  @Test
  void settersUpdateTheFields() {
    Employee e = new Employee();

    e.setEmployeeId("9");
    e.setFirstName("Chidi");
    e.setLastName("Nwosu");
    e.setEmail("chidi.nwosu@example.com");
    e.setTitle("Designer");

    assertEquals("9", e.getEmployeeId());
    assertEquals("Chidi", e.getFirstName());
    assertEquals("Nwosu", e.getLastName());
    assertEquals("chidi.nwosu@example.com", e.getEmail());
    assertEquals("Designer", e.getTitle());
  }

  @Test
  void newEmployeeWithNoArgumentsHasNullFields() {
    Employee e = new Employee();

    assertNull(e.getEmployeeId());
    assertNull(e.getFirstName());
  }
}