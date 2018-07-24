package com.cg.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.dao.EmployeeDAO;
import com.cg.spring.dto.Employee;


@Service("employeeservice")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDAO employeeDao;;

	@Override
	public void addEmployee(Employee e) {
		
		
		employeeDao.addEmployee(e);
		
	}

	@Override
	public List<Employee> showEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.showEmployees();
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
		employeeDao.updateEmployee(emp);
		
	}

	@Override
	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeDao.searchEmployee(id);
	}

	
	
	

}
