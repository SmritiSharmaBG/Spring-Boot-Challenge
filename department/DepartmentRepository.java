package com.challenge.department;

import com.challenge.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {

    default public Department updateDepartment(String id, Department department) {
        Department exisitngDepartment = getReferenceById(id);
        exisitngDepartment.setDepartmentName(department.getDepartmentName());
        exisitngDepartment.setEmployee(department.getEmployee());
        return save(department);
    }
}
