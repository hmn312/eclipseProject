package com.cssl.service;

import java.sql.SQLException;
import java.util.List;

import com.cssl.po.Student;
import com.github.pagehelper.Page;

public interface StudentService {

	
	
	
	public Page<Student> fenYe(int pageIndex,int pageSize);
}
