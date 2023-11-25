package com.challenge.employee;

import com.challenge.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        if (!isValidAge(employee.getAge()) || !isValidEmail(employee.getEmailID()) || !isValidPhoneNumber(employee.getPhoneNumber())) {
            System.out.println("Error in employee data entry. No new employee saved");
            return null;
        }

        return employeeRepository.save(employee);
    }

    private boolean isValidAge(int age) {
        return (age < 18);
    }

    private boolean isValidEmail(String emailID) {
        String emailRegex = "^(.+)@(\\S+) $.";
        return (!Pattern.matches(emailRegex, emailID));
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        String phoneRegex = "^\\\\d{10}$";
        return (!Pattern.matches(phoneRegex, phoneNumber));
    }

    public Employee getEmployee(int id) {
        return employeeRepository.getReferenceById(id);
    }

    public Employee updateEmployee(int id, Employee employee) {
        return employeeRepository.updateEmployee(id, employee);
    }

    public boolean deleteEmployee(int id) {
        try {
            employeeRepository.delete(getEmployee(id));
            return true;
        } catch (Exception e) {
            System.out.println("Employee not found");
            return false;
        }
    }
}
