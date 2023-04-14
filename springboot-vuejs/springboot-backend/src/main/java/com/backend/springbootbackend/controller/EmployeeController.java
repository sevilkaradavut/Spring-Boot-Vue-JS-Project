package com.backend.springbootbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.springbootbackend.entity.Employee;
import com.backend.springbootbackend.repository.EmployeeRepository;

@RestController
@CrossOrigin("http://localhost:8081/")
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
	public List<Employee> fetchEmplooyes(){
		return employeeRepository.findAll();
	}
}
