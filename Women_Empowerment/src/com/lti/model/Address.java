package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
public class Address
{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int add_id;
	String add_line1;
	String add_line2;
	String landmark;
	String district;
	String city;
	long pincode;
	String state;
	

	
	public Address()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(int add_id, String add_line1, String add_line2, String landmark, String district, String city,
			long pincode, String state) 
	{
		super();
		this.add_id = add_id;
		this.add_line1 = add_line1;
		this.add_line2 = add_line2;
		this.landmark = landmark;
		this.district = district;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}
	public int getAdd_id() {
		return add_id;
	}
	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}
	public String getAdd_line1() {
		return add_line1;
	}
	public void setAdd_line1(String add_line1) {
		this.add_line1 = add_line1;
	}
	public String getAdd_line2() {
		return add_line2;
	}
	public void setAdd_line2(String add_line2) {
		this.add_line2 = add_line2;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [add_id=" + add_id + ", add_line1=" + add_line1 + ", add_line2=" + add_line2 + ", landmark="
				+ landmark + ", district=" + district + ", city=" + city + ", pincode=" + pincode + ", state=" + state
				+ "]";
	}
	
	
}
