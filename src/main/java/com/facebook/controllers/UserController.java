package com.facebook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.facebook.dtos.UserSignUpDto;
import com.facebook.repositories.UserRepository;
import com.facebook.services.UserService;

@RestController
@RequestMapping("/signup")
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public UserSignUpDto signUp(@RequestBody UserSignUpDto dto) {
		return service.createUser(dto);
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public UserSignUpDto findUserByname(@PathVariable String name) {
		return service.findByFirstName(name);

	}

}
