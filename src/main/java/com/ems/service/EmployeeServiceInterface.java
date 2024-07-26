package com.ems.service;

import com.ems.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {
    public Employee saveEmployee(Employee employee);
    public Optional<Employee> getEmployeeById(int id);
    public List<Employee> getAllEmployees();
    Employee updateEmployee(int id,Employee employee);
    void deleteEmployee(int id);
}
