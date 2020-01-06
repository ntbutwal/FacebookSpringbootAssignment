package com.facebook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.facebook.dtos.LogInDto;
import com.facebook.services.LogInService;

@RestController
@RequestMapping("/login")
public class LogInController {
	@Autowired
	private LogInService service;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public LogInDto createLogIn(@RequestBody LogInDto dto) {
		return service.createLogIn(dto);
	}

	@RequestMapping(value = "/{username}", method = RequestMethod.GET)
	public LogInDto findByUserName(@PathVariable String username) {
		return service.findByUserId(username);

	}

}
