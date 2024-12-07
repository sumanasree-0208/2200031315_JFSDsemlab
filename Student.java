package com.model;

public class Student
{
	int sid;
	String sname;
	int sduration;
	public Student()
	{
		
	}
	public Student(int sid, String sname,int duration) 
	{
	
		this.sid = sid;
		this.sname = sname;
		this.sduration=duration;
	}
	public int getSid() 
	{
		return sid;
	}
	public void setSid(int sid)
	{
		this.sid = sid;
	}
	public String getSname() 
	{
		return sname;
	}
	public void setSname(String sname) 
	{
		this.sname = sname;
	}
	public int getSduration() 
	{
		return sduration;
	}
	public void setSduration(int sduration)
	{
		this.sduration = sduration;
	}
	@Override
	public String toString() 
	{
	    return "Student [sid=" + sid + ", sname=" + sname + ", sduration=" + sduration + "]";
	}

	
	
	

}
