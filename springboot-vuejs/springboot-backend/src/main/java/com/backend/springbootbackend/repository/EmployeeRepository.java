package com.backend.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.springbootbackend.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
