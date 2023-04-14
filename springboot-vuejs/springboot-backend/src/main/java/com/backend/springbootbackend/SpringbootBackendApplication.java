package com.backend.springbootbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.backend.springbootbackend.entity.Employee;
import com.backend.springbootbackend.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = Employee.builder()
				.firstName("Sevgi")
				.lastName("Demir")
				.email("sevgidemir@gmail.com")
				.build();
		
		Employee employee2 = Employee.builder()
				.firstName("Ahmet")
				.lastName("Deniz")
				.email("ahmetdeniz@gmail.com")
				.build();
		
		Employee employee3 = Employee.builder()
				.firstName("Seda")
				.lastName("Atasay")
				.email("sedaatasay@gmail.com")
				.build();
		
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		
	}

}
