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
public class EmployeeDaoImp implements EmployeeDao {

	@Autowired
	@PersistenceContext          
	EntityManager entityManager;

	@Override
	public void addEmployee(Employee e) {
		entityManager.persist(e); // saves e to database table

	}

	@Override
	public List<Employee> showEmployee() {

		List<Employee> list = new ArrayList<Employee>();
		Query q = entityManager.createQuery("from Employee");
		list = q.getResultList();
		return list;
	}

}
