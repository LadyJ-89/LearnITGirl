package com.drugtracker.service.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VITAL_SIGNS")
public class VitalSign {
	@Id
	@GeneratedValue
	@Column(name = "sign_id")
	int sign_id;

	@Column(name = "user_id")
	String user_id;
	
	@Column(name = "section")
	String section;

	@Column(name = "value")
	String value;
	
	@Column(name = "sign_date")
	Time sign_date;

	public int getSignId() {
		return sign_id;
	}

	public void setSignId(int sign_id) {
		this.sign_id = sign_id;
	}
	
	public String getUserId() {
		return user_id;
	}

	public void setUserId(String user_id) {
		this.user_id = user_id;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

	public Time getSignDate() {
		return sign_date;
	}
	public void setSignDate(Time sign_date) {
		this.sign_date = sign_date;
	}
}
