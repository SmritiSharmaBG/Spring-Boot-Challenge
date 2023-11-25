package com.challenge.department;

import com.challenge.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * CRUD, Validations for delete
 */
@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }

    @GetMapping("/department/{id}")
    public Department getDepartment(@PathVariable String id) {
        return departmentService.getDepartment(id);
    }

    @PostMapping("/department/{id}")
    public Department updateDepartment(@PathVariable String id, @RequestBody Department department) {
        return departmentService.updateDepartment(id, department);
    }

    @DeleteMapping("/deleteDepartment/{id}")
    public boolean deleteDepartment(@PathVariable String id) {
        return departmentService.deleteDepartment(id);
    }

}
