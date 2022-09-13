package com.onetomanyemployee1.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int deptId;
	private String deptName;
	private int no_OfEmployees;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="deptId",referencedColumnName="deptId")
	List<Employee> employees;
	public Department(int deptId,String deptName,int no_OfEmployees, List<Employee> employees) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.no_OfEmployees = no_OfEmployees;
		this.employees = employees;
		
	}
	public Department() {
		
	}
	public int getDeptId() {
		return deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public int getno_OfEmployees() {
		return no_OfEmployees; 
	}
	public List<Employee> getEmployees(){
		return employees;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public void setNo_OfEmployees(int no_OfEmployees) {
		this.no_OfEmployees = no_OfEmployees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
	
	
	
	
	
	
	

