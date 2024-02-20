package com.learning.springdatajpa.onetomany.bi.repository;

import com.learning.springdatajpa.manytomany.model.Employee;
import com.learning.springdatajpa.onetomany.bi.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
