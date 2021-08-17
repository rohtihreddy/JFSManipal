package com.telstra.Springboot.proj.service;

import com.telstra.Springboot.proj.entity.Department;
import com.telstra.Springboot.proj.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long deptId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long deptId);

    public  Department updateDepartmentById(Long deptId, Department department);


    //public Department fetchDepartmentByName(String deptName);
}
