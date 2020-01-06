package com.facebook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebook.dtos.CommentDto;
import com.facebook.entities.CommentEntity;
import com.facebook.entities.PostEntity;
import com.facebook.entities.UserSignUpEntity;
import com.facebook.repositories.CommentRepository;
import com.facebook.repositories.PostRepository;
import com.facebook.repositories.UserRepository;

@Service
public class CommentService {
	@Autowired
	private CommentRepository commentRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PostRepository postRepository;

	public CommentDto createComment(CommentDto dto) {

		PostEntity pe = postRepository.findByActivity(dto.getCommentedIn());
		UserSignUpEntity use = userRepository.findByFirstName(dto.getCommentedBy());
		CommentEntity cent = new CommentEntity();
		cent.setDescription(dto.getCommentdes());
		cent.setPostEntity(pe);
		cent.setSignUpEntity(use);

		return convert(commentRepository.save(cent));
	}

	public CommentDto convert(CommentEntity ce) {
		CommentDto dtos = null;
		if (ce != null) {
			dtos = new CommentDto();
			dtos.setId(ce.getId());
			dtos.setCommentdes(ce.getDescription());

		}
		return dtos;
	}

}
