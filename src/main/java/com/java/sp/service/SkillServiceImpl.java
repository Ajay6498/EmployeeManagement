package com.java.sp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.sp.beans.SkillsBean;
import com.java.sp.dao.SkillDaoImpl;
import com.java.sp.entitites.SkillsEn;

@Service
public class SkillServiceImpl implements SkillService{

	@Autowired
	private SkillDaoImpl daoImpl;
	
	private SkillsEn beanToEntity(SkillsBean bean) {
		if(bean==null)
			return null;
		
		SkillsEn entity = new SkillsEn();
		entity.setSkillId(bean.getSkillId());
		entity.setSkillName(bean.getSkillName());
		return entity;
	}
	
	private SkillsBean entityToBean(SkillsEn entity) {
		if(entity==null)
			return null;
		
		SkillsBean bean = new SkillsBean();
		bean.setSkillId(entity.getSkillId());
		bean.setSkillName(entity.getSkillName());
		return bean;
	}
	
	
	public String addNewSkill(SkillsBean newSkills) {
		return daoImpl.insertSkill(beanToEntity(newSkills));
	}

	public SkillsBean modifySkill(int skId, SkillsBean newSkills) {
		return entityToBean(daoImpl.updateSkill(skId, beanToEntity(newSkills)));
	}

	public SkillsBean getSkill(int skId) {
		return entityToBean(daoImpl.fetchSkill(skId));
	}

	public List<SkillsBean> getAllSkill() {
		List<SkillsEn> entities =  daoImpl.fetchAllSkill();
		List<SkillsBean> beans = new ArrayList<SkillsBean>();
		
		for (SkillsEn entEn : entities) {
			beans.add(entityToBean(entEn));
		}
		return beans;
	}

	public String removeSkill(int skId) {
		return daoImpl.deleteSkill(skId);
	}

}
