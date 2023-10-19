package com.leosargino.workshopmongo.service;

import com.leosargino.workshopmongo.domain.Post;
import com.leosargino.workshopmongo.domain.User;
import com.leosargino.workshopmongo.dto.UserDTO;
import com.leosargino.workshopmongo.repository.PostRepository;
import com.leosargino.workshopmongo.repository.UserRepository;
import com.leosargino.workshopmongo.service.exception.ObjetcNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(() -> new ObjetcNotFoundException("Objeto não encontrado"));
    }

}

