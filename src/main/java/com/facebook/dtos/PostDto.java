package com.facebook.dtos;

public class PostDto {

	private Long id;
	private String activity;
	private String postdesc;
	private String postBy;
	private String tagedTo;

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

	public String getPostdesc() {
		return postdesc;
	}

	public void setPostdesc(String postdesc) {
		this.postdesc = postdesc;
	}

	public String getPostBy() {
		return postBy;
	}

	public void setPostBy(String postBy) {
		this.postBy = postBy;
	}

	public String getTagedTo() {
		return tagedTo;
	}

	public void setTagedTo(String tagedTo) {
		this.tagedTo = tagedTo;
	}

}
