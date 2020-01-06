package com.facebook.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Log_In")
public class LogInEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "User_Name")
	private String username;

	@Column(name = "Password")
	private String password;

	@Column(name = "Last_Sign_In")
	private Date lastSignIn;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Sign_Up_Id")
	private UserSignUpEntity signUpEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastSignIn() {
		return lastSignIn;
	}

	public void setLastSignIn(Date lastSignIn) {
		this.lastSignIn = lastSignIn;
	}

	public UserSignUpEntity getSignUpEntity() {
		return signUpEntity;
	}

	public void setSignUpEntity(UserSignUpEntity signUpEntity) {
		this.signUpEntity = signUpEntity;
	}

}
