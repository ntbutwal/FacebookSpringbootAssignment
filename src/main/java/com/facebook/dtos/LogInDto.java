package com.facebook.dtos;

import java.util.Date;

public class LogInDto {

	private Long id;
	private String username;
	private String password;
	private Date lastSignIn;
	private String findByEmail;
	private UserSignUpDto signUpDto;

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

	public String getFindByEmail() {
		return findByEmail;
	}

	public void setFindByEmail(String findByEmail) {
		this.findByEmail = findByEmail;
	}

	public UserSignUpDto getSignUpDto() {
		return signUpDto;
	}

	public void setSignUpDto(UserSignUpDto signUpDto) {
		this.signUpDto = signUpDto;
	}

}
