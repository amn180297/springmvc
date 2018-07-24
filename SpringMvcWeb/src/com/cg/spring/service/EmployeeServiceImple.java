package com.cg.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.dao.EmployeeDao;
import com.cg.spring.dto.Employee;

@Service("employeeservice")
@Transactional
public class EmployeeServiceImple implements EmployeeService {
	
	
	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		employeeDao.addEmployee(e);
	}

	@Override
	public List<Employee> showEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.showEmployee();
	}

}
