package com.drugtracker.service.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DRUG_TRACK")
public class DrugTrack {
	@Id
	@GeneratedValue
	@Column(name = "drug_plan_id")
	int drug_plan_id;

	@Column(name = "taken")
	Time taken;

	public int getDrugPlanId() {
		return drug_plan_id;
	}

	public void setDrugPlanId(int drug_plan_id) {
		this.drug_plan_id = drug_plan_id;
	}

	public Time getTaken() {
		return taken;
	}

	public void setTaken(Time taken) {
		this.taken = taken;
	}
}
