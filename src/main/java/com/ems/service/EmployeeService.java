package com.ems.service;


import com.ems.model.Employee;
import com.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeServiceInterface {

   @Autowired
   private EmployeeRepository employeeRepository;


    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
       Employee employeeToUpdate = employeeRepository.findById(id).orElseThrow();
       employeeToUpdate.setFirstName(employee.getFirstName());
       employeeToUpdate.setLastName(employee.getLastName());
       employeeToUpdate.setEmail(employee.getEmail());
       return employeeRepository.save(employeeToUpdate);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}
