package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
public class NGO {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	int n_id;
	String name_of_org;
	
	String website;
	String pan_card_org;
	int year_of_establishment;
	String status;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="add_id")
	public Address address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="contact_id")
	public Contact_Person contact_person;

	public NGO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NGO(int n_id, String name_of_org, String website, String pan_card_org, int year_of_establishment,
			String status, Address address, Contact_Person contact_person) {
		super();
		this.n_id = n_id;
		this.name_of_org = name_of_org;
		this.website = website;
		this.pan_card_org = pan_card_org;
		this.year_of_establishment = year_of_establishment;
		this.status = status;
		this.address = address;
		this.contact_person = contact_person;
	}

	public int getN_id() {
		return n_id;
	}

	public void setN_id(int n_id) {
		this.n_id = n_id;
	}

	public String getName_of_org() {
		return name_of_org;
	}

	public void setName_of_org(String name_of_org) {
		this.name_of_org = name_of_org;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPan_card_org() {
		return pan_card_org;
	}

	public void setPan_card_org(String pan_card_org) {
		this.pan_card_org = pan_card_org;
	}

	public int getYear_of_establishment() {
		return year_of_establishment;
	}

	public void setYear_of_establishment(int year_of_establishment) {
		this.year_of_establishment = year_of_establishment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact_Person getContact_person() {
		return contact_person;
	}

	public void setContact_person(Contact_Person contact_person) {
		this.contact_person = contact_person;
	}

	@Override
	public String toString() {
		return "NGO [n_id=" + n_id + ", name_of_org=" + name_of_org + ", website=" + website + ", pan_card_org="
				+ pan_card_org + ", year_of_establishment=" + year_of_establishment + ", status=" + status
				+ ", address=" + address + ", contact_person=" + contact_person + "]";
	}

}
