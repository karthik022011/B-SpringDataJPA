package com.learning.springdatajpa.manytomany.repository;

import com.learning.springdatajpa.manytomany.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
