package com.onetomanyemployee1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetomanyemployee1.entity.Department;
import com.onetomanyemployee1.entity.Employee;
import com.onetomanyemployee1.repository.DepartmentRepository;
import com.onetomanyemployee1.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	
	public List<Employee> getAllEmployees(){
		return empRepo.findAll();
	}
    public Employee getEmployee(int id) {
    	Employee e= empRepo.findById(id).get();
    	if(e!=null) {
    		return e;
    	}
    	return null;
    }
    
    public String addEmployee(Employee e) {
    empRepo.save(e);
    	return "employee inserted successfully";
    }
    
    public String updateName(int id,String name) {
    	Employee e= empRepo.findById(id).get();
    	if(e!=null) {
    		e.SetEmName(name);
    		empRepo.save(e);
    		return "Record updated successfully";
    	}
    	else
    		return null;
    }
     
    public String updateSalary(int id, double salary) {
    	Employee e= empRepo.findById(id).get();
    	if(e!=null) {
    		e.SetSalary(salary);
    		empRepo.save(e);
    		return "Record updated successfully";
    	}
    	else
    		return null;
    }
    	
    
    public String  deleteEmployee(int id) {
    	Employee e= empRepo.findById(id).get();
    	if(e!=null) {
    		empRepo.deleteById(id);
    		return "record deleted successfully";
    	}
    	else
    		return null;
    }
}
    
