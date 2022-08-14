package com.onetomanydemo.OneTomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetomanydemo.OneTomany.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

}
