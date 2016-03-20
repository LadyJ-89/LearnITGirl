package com.drugtracker.service.dao;

import java.util.List;

import com.drugtracker.service.model.DrugPlanTimes;

public interface DrugPlanTimesDao {

	public List<DrugPlanTimes> getDrugPlanTimes();
	public DrugPlanTimes getDrugPlanTime(int drug_plan_id);
	public void insertDrugPlanTime(DrugPlanTimes drugplantime);
}
