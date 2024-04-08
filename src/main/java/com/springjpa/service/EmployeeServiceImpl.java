package com.springjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springjpa.model.Employee;
import com.springjpa.repository.EmployeeRepository;

@Component
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee findById(int id) {
		
		return employeeRepository.findById(id);
	}

	@Override
	public Employee createEmployee(Employee employee) {
		
		return employeeRepository.createEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
	
		return employeeRepository.updateEmployee(employee);
	}

	@Override
	public List<Employee> findAllEmployees() {

		return employeeRepository.findAllEmployees();
	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepository.deleteEmployee(id);
		
	}

	
}
