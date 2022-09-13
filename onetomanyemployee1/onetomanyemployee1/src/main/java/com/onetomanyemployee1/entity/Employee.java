package com.onetomanyemployee1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")

public class Employee {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	@Column private String empName;
	@Column private double salary;
	
	public Employee()
	{
		
	}
  public Employee(int empId, String empName,double salary) {
	  super();
	  this.empId = empId;
	  this.empName = empName;
	  this.salary = salary;
  }
 
	 public String getEmpName() {
		 return empName;
	 }
	 public void SetEmName(String empName) {
		 this.empName =  empName;
	 }
	 public double getSalary() {
		 return salary;
	 }
	 public void SetSalary(double salary) {
		 this.salary =  salary;
	 }
		public int getEmpId() {
			return empId;
		}
	

}

