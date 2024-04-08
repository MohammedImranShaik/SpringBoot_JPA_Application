package com.springjpa.service;

import java.util.List;

import com.springjpa.model.Employee;

public interface EmployeeService {
	
	Employee findById(int productId);
	
	Employee createEmployee(Employee employee);
	
	Employee updateEmployee(Employee employee);
	
	List<Employee> findAllEmployees();
	
	void deleteEmployee(int id);

}
