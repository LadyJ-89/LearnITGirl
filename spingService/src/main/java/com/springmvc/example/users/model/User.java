package com.springmvc.example.users.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DBUSER")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	int user_id;

	@Column(name = "username", nullable = false, length = 20)
	String username;

	@Column(name = "created_by", nullable = false, length = 20)
	String created_by;

	@Column(name = "created_date", nullable = false, length = 7)
	String created_date;

	public int getUserId() {
		return user_id;
	}

	public void setUserId(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCreatedBy() {
		return created_by;
	}

	public void setCreatedyBy(String created_by) {
		this.created_by = created_by;
	}

	public String getCreatedDate() {
		return created_date;
	}

	public void setCreatedDate(String created_date) {
		this.created_date = created_date;
	}
}
