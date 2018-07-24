package com.cg.spring.service;

import java.util.List;

import com.cg.spring.dto.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee e);
	public List<Employee> showEmployees();
	public void deleteEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public Employee searchEmployee(int id);
	
}
