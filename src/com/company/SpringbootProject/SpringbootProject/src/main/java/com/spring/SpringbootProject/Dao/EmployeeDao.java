package com.spring.SpringbootProject.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringbootProject.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
