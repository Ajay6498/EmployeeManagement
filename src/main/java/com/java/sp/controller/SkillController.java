package com.java.sp.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.sp.beans.SkillsBean;
import com.java.sp.service.SkillServiceImpl;

@Controller
@RequestMapping("/skills")
public class SkillController {

	@Autowired
	private SkillServiceImpl service;
	
	
	@RequestMapping(value = "/welcome",method = RequestMethod.GET)
	public ModelAndView showSkillsPage() {
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("skbean",new SkillsBean());
		return new ModelAndView("skill",model);
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public ModelAndView addSkill(@ModelAttribute("skbean")SkillsBean skbean) {
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("skbean",new SkillsBean());
		SkillsBean bean = service.getSkill(skbean.getSkillId());
		String msg  = "";
		if(bean==null) {
			msg = service.addNewSkill(skbean);
		}else {
			service.modifySkill(skbean.getSkillId(), skbean);
		}
		//msg = service.addNewSkill(skbean);
		model.put("message",msg);
		return new ModelAndView("skill",model);
		
	}
	

	@RequestMapping(value = "/edit/{skid}",method = RequestMethod.GET)
	public ModelAndView editSkill(@PathVariable("skid")int skid) {
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("skbean",service.getSkill(skid));
		return new ModelAndView("skill",model);
	}
	
	
	@RequestMapping(value = "/delete/{skid}",method = RequestMethod.GET)
	public ModelAndView deleteSkill(@PathVariable("skid")int skid) {
		
		String message = service.removeSkill(skid);
		
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("skillList",service.getAllSkill());
		model.put("message",message);
		return new ModelAndView("showskills",model);
		
	}
	
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ModelAndView showAllSkills() {
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("skillList",service.getAllSkill());
		return new ModelAndView("showskills",model);
		
	}
	
	
	
	
	
}
