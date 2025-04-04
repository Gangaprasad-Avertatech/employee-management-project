package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.Service.EmployeeService;
import com.example.demo.entity.Employee;

@Service
public class EmployeeDao implements EmployeeService
{
	@Autowired
	EmployeeRepo er;

	@Override
	public void register(Employee e1)
	{
		er.save(e1);	
		
	}

	@Override
	public List<Employee> getallinfo() 
	{
		
		return er.findAll();
	}

	@Override
	public void del(int id) 
	{
		er.deleteById(id);
		
	}

	@Override
	public Employee update(int id, Employee newEmployeeData) 
	{
		
	    Employee existingEmployee = er.findById(id)
	    .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));

	    existingEmployee.setEmployeeName(newEmployeeData.getEmployeeName());
	    existingEmployee.setEmployeeMobile(newEmployeeData.getEmployeeMobile());

	    return er.save(existingEmployee);
	    
	}

}
