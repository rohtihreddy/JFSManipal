package com.telstra.Springboot.proj.service;

import com.telstra.Springboot.proj.entity.Department;
import com.telstra.Springboot.proj.error.DepartmentNotFoundException;
import com.telstra.Springboot.proj.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;


    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long deptId) throws DepartmentNotFoundException {
       // return departmentRepository.findById(deptId).get();
        Optional<Department> department= departmentRepository.findById(deptId);
        if(!department.isPresent()){
            throw new DepartmentNotFoundException("Department not available");
        }
        return department.get();
    }

    @Override
    public void deleteDepartmentById(Long deptId) {
        departmentRepository.deleteById(deptId);
    }

    @Override
    public Department updateDepartmentById(Long deptId, Department department) {

        Department depDB= departmentRepository.findById(deptId).get();
       if(Objects.nonNull(department.getDeptName()) &&
               !"".equalsIgnoreCase(department.getDeptName())){
           depDB.setDeptName(department.getDeptName());
       }

        if(Objects.nonNull(department.getDeptAdd()) &&
                !"".equalsIgnoreCase(department.getDeptAdd())){
            depDB.setDeptAdd(department.getDeptAdd());
        }
        if(Objects.nonNull(department.getDeptCode()) &&
                !"".equalsIgnoreCase(department.getDeptCode())){
            depDB.setDeptCode(department.getDeptCode());
        }
        return departmentRepository.save(depDB);
    }


   /* @Override
    public Department fetchDepartmentByName(String deptName){
        return departmentRepository.findByDepartmentNameIgnoreCase(deptName);
    }*/
}
