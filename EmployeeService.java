package com.imaginnovate.exam.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  com.imaginnovate.exam.entity;
import  com.imaginnovate.exam.repository;

@Service
public class EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;

  public Employee saveEmployee(Employee employee) throws existEmployeeIDException {
    // Check for existing employeeId
    if (employeeRepository.findByEmployeeId(employee.getEmployeeId()).isPresent()) {
      throw new existEmployeeIDException("Employee ID already exists");
    }
    return employeeRepository.save(employee);
  }
}

