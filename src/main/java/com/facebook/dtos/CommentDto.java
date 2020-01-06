package com.facebook.dtos;

public class CommentDto {
	private Long id;
	private String commentdes;
	private String commentedIn;
	private String commentedBy;
	private PostDto postDto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCommentdes() {
		return commentdes;
	}

	public void setCommentdes(String commentdes) {
		this.commentdes = commentdes;
	}

	public String getCommentedIn() {
		return commentedIn;
	}

	public void setCommentedIn(String commentedIn) {
		this.commentedIn = commentedIn;
	}

	public String getCommentedBy() {
		return commentedBy;
	}

	public void setCommentedBy(String commentedBy) {
		this.commentedBy = commentedBy;
	}

	public PostDto getPostDto() {
		return postDto;
	}

	public void setPostDto(PostDto postDto) {
		this.postDto = postDto;
	}

}
