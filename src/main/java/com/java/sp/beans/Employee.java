package com.java.sp.beans;

import java.util.Arrays;

public class Employee {
	
	private int empId;
	private String empName;
	private int empAge;
	private double empSalary;
	private String empGender;
	private String[] empSkills;
	private String empCity;
	private String[] empHobbies;
	
	public Employee(int empId, String empName, int empAge, double empSalary, String empGender, String[] empSkills,
			String empCity, String[] empHobbies) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
		this.empGender = empGender;
		this.empSkills = empSkills;
		this.empCity = empCity;
		this.empHobbies = empHobbies;
	}
	@Override
	public String toString() {
		return "\n [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
				+ ", empGender=" + empGender + ", empSkills=" + Arrays.toString(empSkills) + ", empCity=" + empCity
				+ ", empHobbies=" + Arrays.toString(empHobbies) + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public String[] getEmpSkills() {
		return empSkills;
	}
	public void setEmpSkills(String[] empSkills) {
		this.empSkills = empSkills;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public String[] getEmpHobbies() {
		return empHobbies;
	}
	public void setEmpHobbies(String[] empHobbies) {
		this.empHobbies = empHobbies;
	}
	public Employee() {
		super();
	}
	
	
	
	
	
}
