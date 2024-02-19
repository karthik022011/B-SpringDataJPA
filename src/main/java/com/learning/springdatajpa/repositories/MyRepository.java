package com.learning.springdatajpa.repositories;

import com.learning.springdatajpa.onetomany.uni.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends JpaRepository<Post, Long> {
}
