package com.fna.service;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.fna.model.Post;
import com.fna.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;
	public ResponseEntity<List<Post>> getPosts() {
		try {
			System.out.println("user Service ");
			List<Post> post = new ArrayList<Post>();
			System.out.println(postRepository.findAll());
			postRepository.findAll().forEach(post::add);
			for(Post u:post) {
				System.out.println("posts "+u);
			}
			if (post.isEmpty()) {
				System.out.println("empty");
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(post, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
