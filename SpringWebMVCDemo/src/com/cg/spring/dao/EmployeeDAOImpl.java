package com.cg.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.spring.dto.Employee;


@Repository("employeedao")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	
	@Autowired
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		
		entityManager.persist(e);
		
		
	}

	@Override
	public List<Employee> showEmployees() {
		// TODO Auto-generated method stub
		
		List<Employee> list = new ArrayList<Employee>();
		Query q = entityManager.createQuery("from Employee");
		list = q.getResultList();
		return list;
	}

	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		Query q = entityManager.createQuery("from Employee where id=:emp_id");
		q.setParameter("emp_id", emp.getId());
		
		Employee e = (Employee) q.getSingleResult();
		entityManager.remove(e);
		
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		
		entityManager.merge(emp);
		
	}

	@Override
	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		
		
		Employee e= entityManager.find(Employee.class, id);
		return e;
	}
	
	

	

	

}
