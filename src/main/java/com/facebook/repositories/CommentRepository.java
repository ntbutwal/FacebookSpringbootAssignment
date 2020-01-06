package com.facebook.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.facebook.entities.CommentEntity;

@Repository
public interface CommentRepository extends CrudRepository<CommentEntity, Long> {

}
