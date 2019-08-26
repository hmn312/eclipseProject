package com.cssl.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cssl.dao.StudentMapper;
import com.cssl.po.Student;
import com.cssl.service.StudentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
@Service
@Transactional
public class StudentServiceImpl  implements StudentService{
	
	@Autowired
	private StudentMapper  studentMapper; 


	@Override
	public Page<Student> fenYe(int pageIndex, int pageSize) {
		
		Page<Student> startPage = PageHelper.startPage(pageIndex, pageSize);		
		studentMapper.fenYe();
		System.out.println("总页数:"+startPage.getPages());
		System.out.println("总记录:"+startPage.getTotal());
		return startPage;
	
	}

}
