package com.java.sp.controller;

import java.util.HashMap;


import org.springframework.beans.factory.annotation.Autowired;

import com.java.sp.beans.Employee;
import com.java.sp.dao.EmployeeDao;
import com.java.sp.service.EmployeeService;
import com.java.sp.service.SkillService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	
	@Autowired
	SkillService skService;
	
	//http://localhost:8082/spring/employee/save
	
	///springApp/employee/save ---> first method
	@RequestMapping(value = "/save",method = RequestMethod.GET)
	public ModelAndView employeeRecord() {
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("welcome","First Spring Action Invoked..");
		model.put("empBean",new Employee());
		model.put("skilllist",skService.getAllSkill());
		// fetch list of employees -- set it inside --> model madhe...
		return new ModelAndView("employee",model);
	}	
	
	
	//http://localhost:8082/spring/employee/save
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public ModelAndView saveEmployeeRecord(@ModelAttribute("empBean")Employee emp) {
		System.out.println("EMP Details" + emp);
	//	 String msg = empService.addEmployee(emp);
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("message","");
		model.put("empBean",new Employee());
		return new ModelAndView("employee",model);
	}	
	
}

//http://localhost:8080/employee		/save
