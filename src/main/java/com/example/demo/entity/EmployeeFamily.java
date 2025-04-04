package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "employee_family")
public class EmployeeFamily {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "family_id")
	private int familyId;
	
	@Column(name = "family_name")
	private String familyName;
	
	@Column(name = "family_mobile")
	private String familyMobile;
	
	@ManyToOne
	@JoinColumn(name = "employee_id", nullable = false)
	@JsonBackReference
	private Employee employee;

	public int getFamilyId() {
		return familyId;
	}

	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFamilyMobile() {
		return familyMobile;
	}

	public void setFamilyMobile(String familyMobile) {
		this.familyMobile = familyMobile;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
}
