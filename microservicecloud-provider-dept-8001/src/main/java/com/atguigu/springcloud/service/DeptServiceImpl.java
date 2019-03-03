package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.entity.Department;


@Service
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	DeptDao deptDao;
	
	@Override
	public boolean addDept(Department dept) {
		// TODO Auto-generated method stub
		return deptDao.addDept(dept);
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return deptDao.findAll();
	}

	@Override
	public Department findById(Integer id) {
		// TODO Auto-generated method stub
		return deptDao.findById(id);
	}

}
