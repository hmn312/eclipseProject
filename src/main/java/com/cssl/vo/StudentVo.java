package com.cssl.vo;

import java.util.Date;

public class StudentVo {
	private int sid;
	private String sname;
	private Date bornDate;
	
	public StudentVo() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", bornDate=" + bornDate + "]";
	}


	public StudentVo(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}


	public StudentVo(int sid, String sname, Date bornDate) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.bornDate = bornDate;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getBornDate() {
		return bornDate;
	}
	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}
	
	
}
