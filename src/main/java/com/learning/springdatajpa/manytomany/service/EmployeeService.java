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


    public Employee createEmployee(@RequestBody Employee entity) {
        // save Employee
        Employee  employee = employeeRepository.save(entity);
        return employee;
    }

    public Employee createEmployeeForProject(@RequestBody Employee entity,
                                           @PathVariable(name = "projId") String projId) {
        // save Employee
        Employee employee = employeeRepository.save(entity);

        // get a Project
        Project project = projectRepository.getById(Integer.valueOf(projId));

        // create Employee set
        Set<Employee> employees = new HashSet<>();
        employees.add(employee);

        // assign Employee Set to Project
        project.setEmployees(employees);

        // save Project
        project = projectRepository.save(project);

        return employee;

    }


    public Employee getEmployee(@PathVariable(name = "empId") Integer empId) {
        // get Employee details
        Employee employee = this.employeeRepository.getById(empId);
        return employee;
    }
}
