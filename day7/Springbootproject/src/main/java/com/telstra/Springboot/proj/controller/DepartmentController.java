package com.telstra.Springboot.proj.controller;

import com.telstra.Springboot.proj.entity.Department;
import com.telstra.Springboot.proj.error.DepartmentNotFoundException;
import com.telstra.Springboot.proj.service.DepartmentService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.PushBuilder;
import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Inside save method");
        return departmentService.saveDepartment(department);

    }
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        LOGGER.info("Inside get all depts method");
    return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long deptId) throws DepartmentNotFoundException {
        LOGGER.info("Inside get dept by id method");
        return departmentService.fetchDepartmentById(deptId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long deptId){
        departmentService.deleteDepartmentById(deptId);
        return "Department deleted";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentById(@PathVariable("id") Long deptId,
                                           @RequestBody Department department){
       return departmentService.updateDepartmentById(deptId,department);
    }

    /*@GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String deptName){
        return departmentService.fetchDepartmentByName(deptName);
    }*/

}
