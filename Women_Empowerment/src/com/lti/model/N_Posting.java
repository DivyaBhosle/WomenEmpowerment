package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class N_Posting
{
	@Id @GeneratedValue
	int p_id;
	int course_id;//fk
	int h_id;//fk
	int d_id;//fk
	String date_time;
	public N_Posting()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public N_Posting(int p_id, int course_id, int h_id, int d_id, String date_time) {
		super();
		this.p_id = p_id;
		this.course_id = course_id;
		this.h_id = h_id;
		this.d_id = d_id;
		this.date_time = date_time;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public int getH_id() {
		return h_id;
	}
	public void setH_id(int h_id) {
		this.h_id = h_id;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getDate_time() {
		return date_time;
	}
	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}
	
	@Override
	public String toString() {
		return "N_Posting [p_id=" + p_id + ", course_id=" + course_id + ", h_id=" + h_id + ", d_id=" + d_id
				+ ", date_time=" + date_time + "]";
	}
	
	
}
