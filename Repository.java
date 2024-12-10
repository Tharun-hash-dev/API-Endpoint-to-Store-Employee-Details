package com.imaginnovate.exam.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.imaginnovate.exam.entity;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  Optional<Employee> findByEmployeeId(String employeeId);
}
