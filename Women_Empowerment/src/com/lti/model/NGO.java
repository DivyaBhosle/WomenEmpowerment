package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NGO {
	
	@Id @GeneratedValue
	int n_id;
	String name_of_org;
	int add_id;
	int contact_id;
	String website;
	String pan_card_org;
	int year_of_establishment;
	String status;
	public NGO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NGO(int n_id, String name_of_org, int add_id, int contact_id, String website, String pan_card_org,
			int year_of_establishment, String status) {
		super();
		this.n_id = n_id;
		this.name_of_org = name_of_org;
		this.add_id = add_id;
		this.contact_id = contact_id;
		this.website = website;
		this.pan_card_org = pan_card_org;
		this.year_of_establishment = year_of_establishment;
		this.status = status;
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
	public int getAdd_id() {
		return add_id;
	}
	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
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
	@Override
	public String toString() {
		return "NGO [n_id=" + n_id + ", name_of_org=" + name_of_org + ", add_id=" + add_id + ", contact_id="
				+ contact_id + ", website=" + website + ", pan_card_org=" + pan_card_org + ", year_of_establishment="
				+ year_of_establishment + ", status=" + status + "]";
	}

}
