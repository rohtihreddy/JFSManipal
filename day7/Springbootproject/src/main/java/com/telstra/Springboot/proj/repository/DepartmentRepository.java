package com.telstra.Springboot.proj.repository;

import com.telstra.Springboot.proj.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    /*public Department findByDepartmentName(String deptName);

    public Department findByDepartmentNameIgnoreCase(String deptName);*/
}
