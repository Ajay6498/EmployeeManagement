package com.java.sp.service;

import java.util.List;

import com.java.sp.beans.SkillsBean;

public interface SkillService {
	public String addNewSkill(SkillsBean newSkills);
	public SkillsBean modifySkill(int skId,SkillsBean newSkills);
	public SkillsBean getSkill(int skId);
	public List<SkillsBean> getAllSkill();
	public String removeSkill(int skId);
}
