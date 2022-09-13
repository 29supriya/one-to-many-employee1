package com.onetomanyemployee1.controller;

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

import com.onetomanyemployee1.entity.Department;
import com.onetomanyemployee1.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
@Autowired
private DepartmentService deptService;

@GetMapping("/departments")
public List<Department> employeeList(){
	return deptService.getAllDepartment();
}

@GetMapping("/departments/{id}")
public Department getById(@PathVariable(value="id")int id){
	return deptService.getDepartment(id);
}

@PostMapping("/adddepartment")
public String add(@RequestBody Department d) {
return deptService.addDepartment(d);
}

@PutMapping("/updatedepartmentnamebyid/{id}/{name}")
public String update(@PathVariable(value="id")int id,@PathVariable(value="name")String name) {
	return deptService.updateNmae(id, name);
}

@DeleteMapping("/deletdepartment/{id}")
public String delete(@PathVariable(value="id") int id) {
	return deptService.deleteDepartment(id);
	
}
}

