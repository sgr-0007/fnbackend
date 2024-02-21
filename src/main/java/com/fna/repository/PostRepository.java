package com.fna.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fna.model.Post;

public interface PostRepository extends JpaRepository<Post,Integer> {

}
