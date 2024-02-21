package com.fna.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fna.model.Post ;

import com.fna.service.PostService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class PostController {
	@Autowired
	private PostService postService;
	@GetMapping("/Posts")
    public ResponseEntity<List<Post>> findPosts() {     
	return postService.getPosts();
    }

}
