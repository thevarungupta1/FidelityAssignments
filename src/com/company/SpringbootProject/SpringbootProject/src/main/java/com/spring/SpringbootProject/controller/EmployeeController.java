package com.spring.SpringbootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.SpringbootProject.services.EmployeeService;
import java.util.List;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.spring.SpringbootProject.entities.Employee;
import com.spring.SpringbootProject.services.EmployeeService;
import com.spring.SpringbootProject.services.EmployeeServiceImp;




@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping("/home")
	public String home() {
		System.out.println("Inside Home");
		return "home";
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees()
	{
		return this.employeeservice.getEmployees();
		
	}
	
	@GetMapping("/employees/{empId}")
	public Employee getEmployee(@PathVariable int empId) {
		return this.employeeservice.getEmployee(empId);
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee){
		return this.employeeservice.addEmployee(employee);
	}
	{
		
	}

	
}
