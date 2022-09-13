package com.onetomanyemployee1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetomanyemployee1.entity.Department;
import com.onetomanyemployee1.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository deptRepo;
	
	public List<Department> getAllDepartment(){
		return deptRepo.findAll();
	}
    public Department getDepartment(int id) {
    	Department d= deptRepo.findById(id).get();
    	if(d!=null) {
    		return d;
    	}
    	return null;
    }
    
    public String addDepartment(Department d) {
    	deptRepo.save(d);
    	return "employee inserted successfully";
    }
    
    public String updateNmae(int id,String name) {
    	Department d= deptRepo.findById(id).get();
    	if(d!=null) {
    		d.setDeptName(name);
    		deptRepo.save(d);
    		return "Record updated successfully";
    	}
    	else
    		return null;
    }
     
    public String  deleteDepartment(int id) {
    	Department d= deptRepo.findById(id).get();
    	if(d!=null) {
    		deptRepo.deleteById(id);
    		return "record deleted successfully";
    	}
    	else
    		return null;
    }
}
    
    
    
    
    
    
    
    
    
    
    

