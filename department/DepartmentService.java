package com.challenge.department;

import com.challenge.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department getDepartment(String id) {
        return departmentRepository.getReferenceById(id);
    }

    public Department updateDepartment(String id, Department department) {
        return departmentRepository.updateDepartment(id, department);
    }

    public boolean deleteDepartment(String id) {
        try {
            departmentRepository.delete(getDepartment(id));
            return true;
        } catch (Exception e) {
            System.out.println("Department not found. Nothing to delete");
            return false;
        }
    }
}
