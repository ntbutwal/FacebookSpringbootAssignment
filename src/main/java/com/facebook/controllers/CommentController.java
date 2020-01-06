package com.facebook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.facebook.dtos.CommentDto;
import com.facebook.services.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentController {
	@Autowired
	private CommentService service;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public CommentDto postComment(@RequestBody CommentDto commentDto) {
		return service.createComment(commentDto);

	}

}
