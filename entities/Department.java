package com.challenge.entities;

import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Department {
    @Id
    private String departmentId;
    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @OneToMany
    private Employee employee;
}
