package com.java.sp.service;

import java.util.List;

import com.java.sp.beans.Employee;

public interface EmployeeService {
	public String addEmployee(Employee emp);
	public Employee modifyEmployee(int empId,Employee newEmployee);
	public Employee getEmployee(int empId);
	public List<Employee> getAllEmployee();
	public String removeEmployee(int empId);

}
