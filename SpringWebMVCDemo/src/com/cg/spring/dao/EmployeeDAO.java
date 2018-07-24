package com.cg.spring.dao;

import java.util.List;

import com.cg.spring.dto.Employee;

public interface EmployeeDAO {
	
	public void addEmployee(Employee e);
	public List<Employee> showEmployees();
	public void deleteEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public Employee searchEmployee(int id);
	

}
