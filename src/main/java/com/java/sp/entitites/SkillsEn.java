package com.java.sp.entitites;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SKILL_INFO")
public class SkillsEn {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int skillId;
	private String skillName;
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public SkillsEn(int skillId, String skillName) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
	}
	public SkillsEn() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SkillsBean [skillId=" + skillId + ", skillName=" + skillName + "]";
	}
	
	
	
}
