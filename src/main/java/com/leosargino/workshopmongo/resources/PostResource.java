package com.leosargino.workshopmongo.resources;

import com.leosargino.workshopmongo.domain.Post;
import com.leosargino.workshopmongo.domain.User;
import com.leosargino.workshopmongo.dto.UserDTO;
import com.leosargino.workshopmongo.service.PostService;
import com.leosargino.workshopmongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService postService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post post = postService.findById(id);
        return ResponseEntity.ok().body(post);
    }

}
