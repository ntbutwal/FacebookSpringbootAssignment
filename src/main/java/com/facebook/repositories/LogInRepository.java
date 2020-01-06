package com.facebook.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.facebook.entities.LogInEntity;

@Repository
public interface LogInRepository extends CrudRepository<LogInEntity, Long> {

	public LogInEntity findByUsername(String username);

}
