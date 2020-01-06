package com.facebook.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebook.dtos.LogInDto;
import com.facebook.dtos.UserSignUpDto;
import com.facebook.entities.LogInEntity;
import com.facebook.entities.UserSignUpEntity;
import com.facebook.repositories.LogInRepository;
import com.facebook.repositories.UserRepository;

@Service
public class LogInService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private LogInRepository logInRepository;

	public LogInDto createLogIn(LogInDto dto) {
		UserSignUpEntity login = userRepository.findByEmail(dto.getFindByEmail());
		LogInEntity log = new LogInEntity();
		log.setPassword(dto.getPassword());
		log.setUsername(dto.getUsername());
		log.setLastSignIn(new Date());
		log.setSignUpEntity(login);

		return convert(logInRepository.save(log));

	}

	public LogInDto findByUserId(String username) {
		return convert(logInRepository.findByUsername(username));
	}

	public LogInDto convert(LogInEntity entity) {
		LogInDto dto = null;
		if (entity != null) {
			dto = new LogInDto();
			dto.setId(entity.getId());
			dto.setLastSignIn(entity.getLastSignIn());
			dto.setPassword(entity.getPassword());
			dto.setUsername(entity.getUsername());

		}
		return dto;
	}

}
