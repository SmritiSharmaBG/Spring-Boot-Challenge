package com.challenge.employee;

import com.challenge.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityNotFoundException;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    /**
     * We can only edit email, phone, department, role and sub-organization
     *
     * @param id
     * @param employee
     * @return
     */
    default public Employee updateEmployee(int id, Employee employee) {
        try {
            Employee existingEmployee = getReferenceById(id);
            existingEmployee.setEmailID(employee.getEmailID());
            existingEmployee.setPhoneNumber(employee.getPhoneNumber());
            existingEmployee.setDepartment(employee.getDepartment());
            existingEmployee.setOrganization(existingEmployee.getOrganization());
            existingEmployee.setRole(employee.getRole());
            return save(existingEmployee);
        } catch (EntityNotFoundException e) {
            System.out.println("Employee id is not valid. Nothing updated.");
            return null;
        }
    }
}
