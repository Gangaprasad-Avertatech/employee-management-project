package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.entity.Employee;

@RestController
@RequestMapping(value = "/emp")  //maps requests to a controller method or class
public class HomeController
{
	@Autowired
	EmployeeService es;
	
	/* ---------------------- save data ------------------------- */
	
	@PostMapping("/savedata")
	public String getdata(@RequestBody Employee e1)
	{
		es.register(e1);
		return "record save";
	}
	
	/*----------------------display data-------------------------*/
	
	@GetMapping("display")
	public List<Employee>getallinfo()
	{
		List<Employee>l1=es.getallinfo();
		return l1;
	}
	
	

	/*----------------------Delete data-------------------------*/
	@DeleteMapping("/del/{id}")
	public String del(@PathVariable int id) //get id form url
	{
		es.del(id);
		return "record deleted";
	}
	
	/*----------------------edit data-------------------------*/
	
	@PutMapping("/edit/{id}")
	public String update(@PathVariable int id,@RequestBody Employee e1)
	{		
	   Employee e2 = es.update(id,e1);
		return "recored updated";
	}
	

}
