package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Day_Care 
{
	@Id @GeneratedValue
	int d_id;
	String name;
	String contact_name;
	long contact_no;
	int n_id;//fk
	int add_id;//fk
	public Day_Care() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Day_Care(int d_id, String name, String contact_name, long contact_no, int n_id, int add_id)
	{
		super();
		this.d_id = d_id;
		this.name = name;
		this.contact_name = contact_name;
		this.contact_no = contact_no;
		this.n_id = n_id;
		this.add_id = add_id;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	public int getN_id() {
		return n_id;
	}
	public void setN_id(int n_id) {
		this.n_id = n_id;
	}
	public int getAdd_id() {
		return add_id;
	}
	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}
	
	@Override
	public String toString() {
		return "Day_Care [d_id=" + d_id + ", name=" + name + ", contact_name=" + contact_name + ", contact_no="
				+ contact_no + ", n_id=" + n_id + ", add_id=" + add_id + "]";
	}
	
	
}
