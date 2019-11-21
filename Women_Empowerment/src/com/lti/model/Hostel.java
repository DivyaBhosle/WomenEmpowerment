package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hostel
{
	@Id @GeneratedValue
	int h_id;
	String name;
	int add_id;//fk
	float charges;
	int n_id; //fk
	int capacity;
	public Hostel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hostel(int h_id, String name, int add_id, float charges, int n_id, int capacity) {
		super();
		this.h_id = h_id;
		this.name = name;
		this.add_id = add_id;
		this.charges = charges;
		this.n_id = n_id;
		this.capacity = capacity;
	}
	public int getH_id() {
		return h_id;
	}
	public void setH_id(int h_id) {
		this.h_id = h_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAdd_id() {
		return add_id;
	}
	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public int getN_id() {
		return n_id;
	}
	public void setN_id(int n_id) {
		this.n_id = n_id;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Hostel [h_id=" + h_id + ", name=" + name + ", add_id=" + add_id + ", charges=" + charges + ", n_id="
				+ n_id + ", capacity=" + capacity + "]";
	}
	
	
}
