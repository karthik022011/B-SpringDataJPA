package com.learning.springdatajpa.manytomany.service;

import com.learning.springdatajpa.manytomany.model.Employee;
import com.learning.springdatajpa.manytomany.model.Project;
import com.learning.springdatajpa.manytomany.repository.EmployeeRepository;
import com.learning.springdatajpa.manytomany.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashSet;
import java.util.Set;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ProjectRepository projectRepository;


    public Employee createEmployee(Employee entity) {
        // save Employee
        Employee  employee = employeeRepository.save(entity);
        return employee;
    }

    public Employee createEmployeeForProject(Employee entity, String projId) {
        //get a project
        Project project = projectRepository.findById(Integer.valueOf(projId)).get();

        //Assign project to employee
        entity.getProjects().add(project);

        //Save Employee
        Employee employeeTemp = employeeRepository.save(entity);
        return employeeTemp;
    }


    public Employee getEmployee(Integer empId) {
        // get Employee details
        Employee employee = this.employeeRepository.findById(empId).get();
        return employee;
    }
}
