package com.example.demo.EmployeeDto;

import com.example.demo.entity.Employee;

public class EmployeeDto 
{
    private int employeeId;
    private String employeeName;
    private String employeeMobile;

    public EmployeeDto(Employee employee) 
    {
        this.employeeId = employee.getEmployeeId();
        this.employeeName = employee.getEmployeeName();
        this.employeeMobile = employee.getEmployeeMobile();
    }

    // Getters & Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeMobile() {
        return employeeMobile;
    }

    public void setEmployeeMobile(String employeeMobile) {
        this.employeeMobile = employeeMobile;
    }
}
