package com.drugtracker.service.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "DRUG_PLAN")
public class DrugPlan {
	@Id
	@GeneratedValue
	@Column(name = "drug_plan_id")
	int drug_plan_id;

	@Column(name = "user_id")
	String user_id;

	@Column(name = "drug_id")
	int drug_id;
	
	@Type(type="date")
	@Column(name = "start_date")
	Date start_date;

	@Type(type="date")
	@Column(name = "end_date")
	Date end_date;
	
	@Column(name = "freq_type")
	String freq_type;
	
	@Column(name = "freq")
	int freq;

	public int getDrugPlanId() {
		return drug_plan_id;
	}

	public void setDrugPlanId(int drug_plan_id) {
		this.drug_plan_id = drug_plan_id;
	}

	public String getUserId() {
		return user_id;
	}

	public void setUserId(String user_id) {
		this.user_id = user_id;
	}
	
	public int getDrugId() {
		return drug_id;
	}

	public void setDrugId(int drug_id) {
		this.drug_id = drug_id;
	}
	
	public Date getStartDate() {
		return start_date;
	}

	public void setStartDate(Date start_date) {
		this.start_date = start_date;
	}
	
	public Date getEndDate() {
		return end_date;
	}

	public void setEndDate(Date end_date) {
		this.end_date = end_date;
	}
	public String getFreqType() {
		return freq_type;
	}
	
	public void setFreqType(String freq_type) {
		this.freq_type = freq_type;
	}

	public int getFreq() {
		return freq;
	}
	public void setFreq(int freq) {
		this.freq = freq;
	}
}
