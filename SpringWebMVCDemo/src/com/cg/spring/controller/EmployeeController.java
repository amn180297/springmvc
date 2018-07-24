package com.cg.spring.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.dto.Employee;
import com.cg.spring.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping(value="/showall",method=RequestMethod.GET)
	public ModelAndView getAllEmployees()
	{
		List<Employee> list = employeeService.showEmployees();
		
		return new ModelAndView("show","emps",list);
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String myEmployee(@ModelAttribute("emp") Employee emp, Map<String,Object> model)
	{
		model.put("emp", emp);
		return "add_employee";
	}
	
	
	@RequestMapping(value="/addemployee",method=RequestMethod.POST)
	public String addEmployee(@Valid @ModelAttribute("emp") Employee emp,BindingResult result,Map<String,Object> model )
	{
		if(result.hasErrors())
		{
			return "add_employee";
		}
		employeeService.addEmployee(emp);
		return "redirect:/showall";
	}
	

	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String deleteEmpl(@ModelAttribute("emp") Employee emp, Map<String,Object> model)
	{
		
		return "delete_emp";
	}
	
	@RequestMapping(value="/deleteemployee",method=RequestMethod.POST)
	public String deleteEmployee(@ModelAttribute("emp") Employee emp, Map<String,Object> model)
	{
		
		employeeService.deleteEmployee(emp);
		return "redirect:/showall";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String updateEmp(@ModelAttribute("emp") Employee emp, Map<String,Object> model)
	{
		
		return "update_emp";
	}
	
	@RequestMapping(value="/updateemp1",method=RequestMethod.POST)
	public ModelAndView updateEmp1(@ModelAttribute("emp") Employee emp, Map<String,Object> model)
	{
		Employee employee= employeeService.searchEmployee(emp.getId());
		return new ModelAndView("update2_emp", "empu",employee);
	}
	
	@RequestMapping(value="/updateemp2",method=RequestMethod.POST)
	public String updateEmp2(@ModelAttribute("emp") Employee emp, Map<String,Object> model)
	{
		employeeService.updateEmployee(emp);
		return "redirect:/showall";
	}
	
	
	
	
	
	
	
	

}
