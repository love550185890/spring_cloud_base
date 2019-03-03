package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entity.Department;
import com.atguigu.springcloud.service.DeptService;

@RestController
public class DeptController {
	
	@Autowired
	DeptService deptService;
	
	@PostMapping("/dept/add")
	public boolean addDept(@RequestBody Department department) {
		return deptService.addDept(department);
	}
	@GetMapping("/dept/list")
	public List<Department> findAll() {
		return deptService.findAll();
	}
	@GetMapping("/dept/get/{id}")
	public Department findById(@PathVariable("id") Integer id) {
		return deptService.findById(id);
	}
}
