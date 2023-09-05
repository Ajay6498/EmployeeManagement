package com.java.sp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.sp.entitites.SkillsEn;
import com.java.sp.utility.HibernateUtility;

@Repository
public class SkillDaoImpl implements SkillDao{
	
	@Autowired
	private SessionFactory sessionfactory;

	public String insertSkill(SkillsEn newSkills) {
		Session session = null;
		Transaction tr  = null;
		try {
			session = sessionfactory.openSession();
			tr = session.beginTransaction();
			session.save(newSkills);
			return  "Skill Successfully Added..!";
		}catch (Exception e) {
				e.printStackTrace();
				return "Problem In Insert";
		}finally {
			HibernateUtility.resourceCleanUp(session,tr);	
		}
	}

	public SkillsEn updateSkill(int skId, SkillsEn newSkills) {
		Session session = null;
		Transaction tr  = null;
		try {
			session = sessionfactory.openSession();
			SkillsEn sken = session.get(SkillsEn.class, skId);
			if(sken!=null) {
				tr = session.beginTransaction();
				sken.setSkillName(newSkills.getSkillName());
				return (SkillsEn) session.merge(sken);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			HibernateUtility.resourceCleanUp(session,tr);	
		}
		return null;
	}

	public SkillsEn fetchSkill(int skId) {
		Session session = null;
		Transaction tr  = null;
		try {
			session = sessionfactory.openSession();
			tr = session.beginTransaction();
			return session.get(SkillsEn.class, skId);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			HibernateUtility.resourceCleanUp(session,tr);	
		}
		return null;
	}

	public List<SkillsEn> fetchAllSkill() {
		Session session = null;
		Transaction tr  = null;
		try {
			session = sessionfactory.openSession();
			tr = session.beginTransaction();
			return session.createCriteria(SkillsEn.class).list();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			HibernateUtility.resourceCleanUp(session,tr);	
		}
		return null;
	}

	public String deleteSkill(int skId) {
		Session session = null;
		Transaction tr  = null;
		try {
			session = sessionfactory.openSession();
			SkillsEn sken = session.get(SkillsEn.class, skId);
			if(sken!=null) {
				tr = session.beginTransaction();
				session.delete(sken);
				return "Skill Successfully deleted";
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			HibernateUtility.resourceCleanUp(session,tr);	
		}
		return null;
	}
	
	
	
	
}
