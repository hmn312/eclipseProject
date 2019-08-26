package com.cssl.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;


import com.cssl.po.Student;
import com.cssl.service.StudentService;
import com.cssl.vo.StudentVo;
import com.github.pagehelper.Page;

@Controller
public class StudentController  {

	@Autowired
	private StudentService ss;	
	
	@RequestMapping("/fenYe")
	public String fenYe(
		
			Model model) {
				
		Page<Student> page = ss.fenYe(1, 1);
		
		model.addAttribute("stus", page.getResult());
		model.addAttribute("pgIndex", page.getPageNum());
		return "fenye";
		
		
	}
	
	
}
