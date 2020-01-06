package com.facebook.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.facebook.dtos.UserSignUpDto;
import com.facebook.entities.UserSignUpEntity;

@Repository
public interface UserRepository extends CrudRepository<UserSignUpEntity, Long> {

	public UserSignUpEntity findByEmail(String email);
	
	public UserSignUpEntity findByFirstName(String Name);
	

}
