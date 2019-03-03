package com.atguigu.springcloud.service;

import java.util.List;
import com.atguigu.springcloud.entity.Department;

public interface DeptService {
	
	public boolean addDept(Department dept);
	
	public List<Department> findAll();
	
	public Department findById(Integer id);
	
}
