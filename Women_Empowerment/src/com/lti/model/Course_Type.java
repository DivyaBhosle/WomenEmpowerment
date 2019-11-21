package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course_Type
{
	@Id @GeneratedValue
	int type_id;
	String course_name;
	public Course_Type() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Course_Type(int type_id, String course_name) {
		super();
		this.type_id = type_id;
		this.course_name = course_name;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	@Override
	public String toString() {
		return "Course_Type [type_id=" + type_id + ", course_name=" + course_name + "]";
	}
	
}
