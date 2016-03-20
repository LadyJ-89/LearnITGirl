package com.drugtracker.service.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DRUG_PLAN_TIMES")
public class DrugPlanTimes {
	@Id
	@GeneratedValue
	@Column(name = "drug_plan_id")
	int drug_plan_id;

	@Column(name = "time")
	Date time;

	public int getDrugPlanId() {
		return drug_plan_id;
	}

	public void setDrugPlanId(int drug_plan_id) {
		this.drug_plan_id = drug_plan_id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
}
