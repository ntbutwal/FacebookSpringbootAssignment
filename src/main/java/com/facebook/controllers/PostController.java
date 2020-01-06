package com.facebook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.facebook.dtos.PostDto;
import com.facebook.services.PostService;

@RestController
@RequestMapping("/post")
public class PostController {
	@Autowired
	private PostService service;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public PostDto createPost(@RequestBody PostDto postDto) {
		return service.createPost(postDto);

	}

}
