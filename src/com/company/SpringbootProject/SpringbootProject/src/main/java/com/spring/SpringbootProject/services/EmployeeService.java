package com.spring.SpringbootProject.services;

import java.util.List;

import com.spring.SpringbootProject.entities.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	public Employee getEmployee(int empId);
	public Employee addEmployee(Employee newEmployee);
	public Employee UpdateEmployee(Employee updateEmployee);
	public void deleteEmployee(int empId);
	
	
}
