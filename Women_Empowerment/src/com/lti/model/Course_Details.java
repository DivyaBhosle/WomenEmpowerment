package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course_Details {

	@Id @GeneratedValue
	int course_id;
	int type_id; //fk
	int n_id; //fk
	public Course_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course_Details(int course_id, int type_id, int n_id) {
		super();
		this.course_id = course_id;
		this.type_id = type_id;
		this.n_id = n_id;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public int getN_id() {
		return n_id;
	}
	public void setN_id(int n_id) {
		this.n_id = n_id;
	}
	@Override
	public String toString() {
		return "Course_Details [course_id=" + course_id + ", type_id=" + type_id + ", n_id=" + n_id + "]";
	}
	
	
}
