package com.facebook.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.facebook.entities.PostEntity;

@Repository
public interface PostRepository extends CrudRepository<PostEntity, Long> {

	public PostEntity findByActivity(String activity);

}
