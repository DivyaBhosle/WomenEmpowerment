package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NGO_Approval
{
	@Id @GeneratedValue
	int id;
	int n_id; //fk
	String status;
	String remark;
	String date_time;
	public NGO_Approval() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public NGO_Approval(int id, int n_id, String status, String remark, String date_time) {
		super();
		this.id = id;
		this.n_id = n_id;
		this.status = status;
		this.remark = remark;
		this.date_time = date_time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getN_id() {
		return n_id;
	}
	public void setN_id(int n_id) {
		this.n_id = n_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getDate_time() {
		return date_time;
	}
	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}
	
	@Override
	public String toString() {
		return "NGO_Approval [id=" + id + ", n_id=" + n_id + ", status=" + status + ", remark=" + remark
				+ ", date_time=" + date_time + "]";
	}
	
	
	
	
}
