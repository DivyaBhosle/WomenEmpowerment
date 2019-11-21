package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
public class Contact_Person
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int contact_id;
	String name;
	long contact_number;
	

	
	public Contact_Person() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact_Person(int contact_id, String name, long contact_number) {
		super();
		this.contact_id = contact_id;
		this.name = name;
		this.contact_number = contact_number;
	}
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact_number() {
		return contact_number;
	}
	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}
	@Override
	public String toString() {
		return "Contact_Person [contact_id=" + contact_id + ", name=" + name + ", contact_number=" + contact_number
				+ "]";
	}
	
}
