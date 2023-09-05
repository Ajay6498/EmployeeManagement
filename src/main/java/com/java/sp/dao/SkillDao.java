package com.java.sp.dao;

import java.util.List;

import com.java.sp.entitites.SkillsEn;

public interface SkillDao {

	public String insertSkill(SkillsEn newSkills);
	public SkillsEn updateSkill(int skId,SkillsEn newSkills);
	public SkillsEn fetchSkill(int skId);
	public List<SkillsEn> fetchAllSkill();
	public String deleteSkill(int skId);
}
