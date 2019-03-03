package com.atuguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atguigu.springcloud.entity.Department;

@RestController
public class DeptConsumerController {
	private static final String REQUEST_URL = "http://localhost:8001"; 
	@Autowired
	RestTemplate restTemplate;
	
	@PostMapping("/consumer/dept/add")
	public boolean addDept(Department department) {
		
		return restTemplate.postForObject(REQUEST_URL+"/dept/add", department, Boolean.class);
	};
	
	@GetMapping("/consumer/dept/get/{id}")
	public Department findById(@PathVariable("id")Integer id) {
		return restTemplate.getForObject(REQUEST_URL+"/dept/get/"+id, Department.class);
	}
	
	@GetMapping("/consumer/dept/list")
	public List<Department> findAll(){
		return restTemplate.getForObject(REQUEST_URL+"/dept/list", List.class);
	}
}
