package com.spring.SpringbootProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.spring.SpringbootProject.Dao.EmployeeDao;

import java.util.List;


import com.spring.SpringbootProject.entities.Employee;


public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int empId) {
		return (Employee) employeeDao.findAll();
	}

	@Override
	public Employee addEmployee(Employee newEmployee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee UpdateEmployee(Employee updateEmployee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
	}
}