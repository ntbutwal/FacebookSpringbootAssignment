package com.facebook.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Sign_Up_User")
public class UserSignUpEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "First_Name")
	private String firstName;

	@Column(name = "Last_Name")
	private String lastName;

	@Column(name = "Email")
	private String email;

	@Column(name = "Phone_No")
	private String phone;

	@Column(name = "Gender")
	private String gender;

	@Column(name = "Date_of_Birth")
	private Date dob;

	@OneToOne(mappedBy = "signUpEntity", cascade = CascadeType.ALL)
	private LogInEntity logInEntity;

	@OneToMany(mappedBy = "userSignUp", cascade = CascadeType.ALL)
	private List<PostEntity> upostEntity;

	@OneToMany(mappedBy = "signUpEntity", cascade = CascadeType.ALL)
	private List<CommentEntity> commentEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public LogInEntity getLogInEntity() {
		return logInEntity;
	}

	public void setLogInEntity(LogInEntity logInEntity) {
		this.logInEntity = logInEntity;
	}

	public List<PostEntity> getUpostEntity() {
		return upostEntity;
	}

	public void setUpostEntity(List<PostEntity> upostEntity) {
		this.upostEntity = upostEntity;
	}

	public List<CommentEntity> getCommentEntity() {
		return commentEntity;
	}

	public void setCommentEntity(List<CommentEntity> commentEntity) {
		this.commentEntity = commentEntity;
	}

}
