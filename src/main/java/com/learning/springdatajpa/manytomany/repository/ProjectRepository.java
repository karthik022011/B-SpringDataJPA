package com.learning.springdatajpa.manytomany.repository;

import com.learning.springdatajpa.manytomany.model.Employee;
import com.learning.springdatajpa.manytomany.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
