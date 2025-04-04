package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>
{

    @Override
	@EntityGraph(attributePaths = {"familyMembers"})  // This forces eager loading of familyMembers
    List<Employee> findAll();
}
