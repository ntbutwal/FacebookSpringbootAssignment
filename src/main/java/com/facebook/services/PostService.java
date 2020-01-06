package com.facebook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebook.dtos.PostDto;
import com.facebook.entities.PostEntity;
import com.facebook.entities.UserSignUpEntity;
import com.facebook.repositories.PostRepository;
import com.facebook.repositories.UserRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;

	@Autowired
	private UserRepository userRepository;

	public PostDto createPost(PostDto dto) {
		UserSignUpEntity us1 = userRepository.findByFirstName(dto.getPostBy());
		UserSignUpEntity us2 = userRepository.findByFirstName(dto.getTagedTo());
		PostEntity pe = new PostEntity();
		pe.setActivity(dto.getActivity());
		pe.setDescription(dto.getPostdesc());
		pe.setUserSignUp(us1);
		pe.setTaggedUser(us2);
		return convert(postRepository.save(pe));
	}

	public PostDto convert(PostEntity pent) {
		PostDto dto = null;
		if (pent != null) {
			dto = new PostDto();
			dto.setActivity(pent.getActivity());
			dto.setId(pent.getId());
			dto.setPostdesc(pent.getDescription());
		}
		return dto;

	}

}
