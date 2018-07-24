package com.cg.spring.dao;

import java.util.List;

import com.cg.spring.dto.Employee;

public interface EmployeeDao {

		public void addEmployee(Employee e);
		public List<Employee> showEmployee(); 
	
}
