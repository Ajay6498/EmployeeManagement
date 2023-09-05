package com.java.sp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.sp.entitites.Employee;
import com.java.sp.utility.HibernateUtility;

@Repository
public class EmployeeDaoimpl implements EmployeeDao {
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	public String insertEmployeeRecord(Employee emp) {
		Session session  = null;
		Transaction tr = null;
		try {
			session  = sessionFactory.openSession();
			tr = session.beginTransaction();
			session.save(emp);
			return "Employee Successfully Added";
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Problem in save");
			return "Problem in save";
		}finally {
			session.flush();
			tr.commit();
		}
	}


	public Employee updateEmployee(int emoId, Employee newEmployee) {
		// TODO Auto-generated method stub
		return null;
	}


	public Employee fetchEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Employee> fetchAllEmployee() {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tr = null;
		try {
			session = sessionFactory.openSession();
			tr = session.beginTransaction();
			return session.createCriteria(Employee.class).list();
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		finally {
			HibernateUtility.resourceCleanUp(session, tr);
		}
		return null;
	}


	public String deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
