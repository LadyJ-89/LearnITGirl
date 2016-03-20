package com.drugtracker.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DRUGS")
public class Drug {
	@Id
	@GeneratedValue
	@Column(name = "drug_id")
	int drug_id;

	@Column(name = "drug_name")
	String drug_name;

	@Column(name = "description")
	String description;

	public int getDrugId() {
		return drug_id;
	}

	public void setDrugId(int drug_id) {
		this.drug_id = drug_id;
	}

	public String getDrugname() {
		return drug_name;
	}

	public void setDrugname(String drug_name) {
		this.drug_name = drug_name;
	}
	
	public String getDrugDescription() {
		return description;
	}
	
	public void setDrugDescription(String description) {
		this.description = description;
	}
}
