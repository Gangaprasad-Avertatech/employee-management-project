package com.example.demo.Service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService 
{
	public void register(Employee e1);
	
	public List<Employee> getallinfo();

	public void del(int id);

	public Employee update(int id, Employee s1);

}
