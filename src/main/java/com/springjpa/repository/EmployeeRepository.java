package com.springjpa.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springjpa.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeRepository {

	@Autowired
	private EntityManager entityManager;

	public Employee findById(int id) {
		return entityManager.find(Employee.class, id);

	}

	public Employee createEmployee(Employee employee) {
		return entityManager.merge(employee); // By using the merge method we can insert and update the record If record
												// is exist it will update. If the record is not exist record will
												// create
	}

	public Employee updateEmployee(Employee employee) {
		return entityManager.merge(employee);// By using the merge method we can insert and update the record If record
		// is exist it will update. If the record is not exist record will
		// create
	}

	public List<Employee> findAllEmployees() {
		// This HQL Query Method and also another methods also there for fetch the data
		// from the existing Table
		// return entityManager.createNamedQuery("Select_All_Employee", Employee.class).getResultList();
		return entityManager.createQuery("Select e from Employee e").getResultList();

		// And also we can write the  HQL or JPQL as "FROM EMPLOYEE" 
	}

	public void deleteEmployee(int employeeId) {

		Employee emp = findById(employeeId);

		entityManager.remove(emp);

	}

}
