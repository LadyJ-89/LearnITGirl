package com.drugtracker.service.dao;

import java.util.List;

import com.drugtracker.service.model.VitalSign;

public interface VitalSignDao {

	public List<VitalSign> getVitalSigns();
	public VitalSign getVitalSign(int sign_id);
	public void insertVitalSign(VitalSign vitalsign);
}
