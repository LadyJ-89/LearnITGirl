package com.drugtracker.service.dao;

import java.util.List;

import com.drugtracker.service.model.Drug;

public interface DrugDao {

	public List<Drug> getDrugs();
	public Drug getDrug(int drug_id);
	public void insertDrug(Drug drug);
}
