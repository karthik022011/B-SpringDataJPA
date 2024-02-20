package com.learning.springdatajpa.manytomany.service;

import com.learning.springdatajpa.manytomany.model.Employee;
import com.learning.springdatajpa.manytomany.model.Project;
import com.learning.springdatajpa.manytomany.repository.EmployeeRepository;
import com.learning.springdatajpa.manytomany.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ProjectService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ProjectRepository projectRepository;


    public Project createProject(Project entity) {
        // save Employee
        Project  employee = projectRepository.save(entity);
        return employee;
    }

    public Project assignProjectToEmployees(Integer projId, Integer empId) {
        // get Employee
        Employee employee = employeeRepository.getById(empId);

        // new Project
        Project project = this.projectRepository.getById(projId);

        // create Employee set
        Set<Employee> employees = new HashSet<>();
        employees.add(employee);

        // assign Employee Set to Project
        project.setEmployees(employees);

        // save Project
        Project savedProject = projectRepository.save(project);

        return  savedProject;

    }


    public Project getProject(Integer projId) {
        // get Project details
        Project project = projectRepository.getById(projId);
        return project;
    }
}
