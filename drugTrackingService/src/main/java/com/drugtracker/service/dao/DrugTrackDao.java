package com.drugtracker.service.dao;

import java.util.List;

import com.drugtracker.service.model.DrugTrack;

public interface DrugTrackDao {

	public List<DrugTrack> getDrugTracks();
	public DrugTrack getDrugTrack(int drug_plan_id);
	public void insertDrugTrack(DrugTrack drugtrack);
}
