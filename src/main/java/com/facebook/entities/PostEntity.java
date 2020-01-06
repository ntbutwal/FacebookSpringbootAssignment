package com.facebook.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Post")
public class PostEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Activity")
	private String activity;

	@Column(name = "Post_Description")
	private String description;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "Sign_Up_Id")
	private UserSignUpEntity userSignUp;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "Taged_Id")
	private UserSignUpEntity taggedUser;

	@OneToMany(mappedBy = "postEntity", cascade = CascadeType.ALL)
	private List<CommentEntity> commentEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UserSignUpEntity getUserSignUp() {
		return userSignUp;
	}

	public void setUserSignUp(UserSignUpEntity userSignUp) {
		this.userSignUp = userSignUp;
	}

	public UserSignUpEntity getTaggedUser() {
		return taggedUser;
	}

	public void setTaggedUser(UserSignUpEntity taggedUser) {
		this.taggedUser = taggedUser;
	}

	public List<CommentEntity> getCommentEntity() {
		return commentEntity;
	}

	public void setCommentEntity(List<CommentEntity> commentEntity) {
		this.commentEntity = commentEntity;
	}

}