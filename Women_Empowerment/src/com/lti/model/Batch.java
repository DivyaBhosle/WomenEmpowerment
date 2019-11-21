package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Batch 
{
	@Id @GeneratedValue
	int batch_id;
	int capacity;
	String start_date;
	String end_date;
	int course_id; //fk
	public Batch()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Batch(int batch_id, int capacity, String start_date, String end_date, int course_id) 
	{
		super();
		this.batch_id = batch_id;
		this.capacity = capacity;
		this.start_date = start_date;
		this.end_date = end_date;
		this.course_id = course_id;
	}
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	
	@Override
	public String toString() {
		return "Batch [batch_id=" + batch_id + ", capacity=" + capacity + ", start_date=" + start_date + ", end_date="
				+ end_date + ", course_id=" + course_id + "]";
	}
	
	
	
}
