package com.java.sp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.java.sp.dao.EmployeeDaoimpl;
import com.java.sp.entitites.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDaoimpl daoImpl;
	
	
	private Employee beanToEntity(com.java.sp.beans.Employee bean) {
		if (bean==null)
			return null;
		
		Employee entity = new Employee();
		entity.setEmpName(bean.getEmpGender());
		entity.setEmpSalary(bean.getEmpAge());
		entity.setEmpId(bean.getEmpAge());
		entity.setEmpAge(bean.getEmpAge());
		entity.setEmpGender(bean.getEmpCity());
		return entity;
	}
	private com.java.sp.beans.Employee entityToBean(Employee entity){
		if(entity==null)
			return null;
		
		com.java.sp.beans.Employee bean = new com.java.sp.beans.Employee();
		bean.setEmpId(entity.getEmpId());
		bean.setEmpName(entity.getEmpName());
		bean.setEmpAge(entity.getEmpAge());
		bean.setEmpSalary(entity.getEmpSalary());
		bean.setEmpCity(entity.getEmpGender());
		return bean;
	}
	
	public String addEmployee(com.java.sp.beans.Employee emp) {
		Employee empEntity = new Employee(emp.getEmpId(),emp.getEmpName(),emp.getEmpAge(),emp.getEmpSalary(),emp.getEmpGender());
		return daoImpl.insertEmployeeRecord(empEntity);
	}

	public com.java.sp.beans.Employee modifyEmployee(int empId, com.java.sp.beans.Employee newEmployee) {
		// TODO Auto-generated method stub
		return null;
	}

	public com.java.sp.beans.Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<com.java.sp.beans.Employee> getAllEmployee() {
		// TODO Auto-generated method stub
	 List<Employee> entities = daoImpl.fetchAllEmployee();
	 List<com.java.sp.beans.Employee> beans = new ArrayList<com.java.sp.beans.Employee>();
	 
	 for(Employee entEn : entities) {
		 beans.add(entityToBean(entEn));
		 
	 }
	     return beans;
	}

	public String removeEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}



}
