package com.java.sp.dao;

import java.util.List;

import com.java.sp.entitites.Employee;

public interface EmployeeDao {
	public String insertEmployeeRecord(Employee emp);
	public Employee updateEmployee(int emoId,Employee newEmployee);
	public Employee fetchEmployee(int empId);
	public List<Employee> fetchAllEmployee();
	public String deleteEmployee(int empId);
}
