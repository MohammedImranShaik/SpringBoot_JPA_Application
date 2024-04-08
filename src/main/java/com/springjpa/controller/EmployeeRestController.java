package com.springjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.model.Employee;
import com.springjpa.service.EmployeeService;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	// TODO: Finding the specific employee from the existing list of the table
	@GetMapping("/findEmployee/{employeeId}")
	public Employee findEmployeeById(@PathVariable int employeeId) {
		return employeeService.findById(employeeId);
	}
	
	//TODO: Create employee and insert into the table
	@PostMapping("/createEmp")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@PutMapping("/updateEmp")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/deleteEmp/{employeeId}")
	public void deleteEmployee(@PathVariable int employeeId) {
		 employeeService.deleteEmployee(employeeId);
	}
	
	@GetMapping("/findAllEmp")
	public List<Employee> findAllEmployees() {
		return employeeService.findAllEmployees();
	}
}
