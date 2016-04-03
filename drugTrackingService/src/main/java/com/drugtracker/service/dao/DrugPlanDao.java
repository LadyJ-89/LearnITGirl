package com.drugtracker.service.dao;

import java.util.List;

import com.drugtracker.service.model.DrugPlan;

public interface DrugPlanDao {

	public List<DrugPlan> getDrugPlans();
	public DrugPlan getDrugPlan(int drug_plan_id);
	public void insertDrugPlan(DrugPlan drugplan);
}
