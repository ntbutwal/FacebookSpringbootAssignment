package com.facebook.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebook.dtos.UserSignUpDto;
import com.facebook.entities.UserSignUpEntity;
import com.facebook.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public UserSignUpDto findByFirstName(String name) {
		return convert(repository.findByFirstName(name));

	}

	public UserSignUpDto createUser(UserSignUpDto dto) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();

		UserSignUpEntity us = new UserSignUpEntity();
		us.setDob(dto.getDob());
		us.setEmail(dto.getEmail());
		us.setFirstName(dto.getFname());
		us.setGender(dto.getGender());
		us.setLastName(dto.getLname());
		us.setPhone(dto.getPhone());
		return convert(repository.save(us));

	}

	public UserSignUpDto convert(UserSignUpEntity use) {
		UserSignUpDto dtos = null;
		if (use != null) {
			dtos = new UserSignUpDto();
			dtos.setDob(use.getDob());
			dtos.setEmail(use.getEmail());
			dtos.setFname(use.getFirstName());
			dtos.setGender(use.getGender());
			dtos.setId(use.getId());
			dtos.setLname(use.getLastName());
			dtos.setPhone(use.getPhone());
		}
		return dtos;

	}

}
