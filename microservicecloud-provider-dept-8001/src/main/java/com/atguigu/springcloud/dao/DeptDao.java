package com.atguigu.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.atguigu.springcloud.entity.Department;

@Mapper()
public interface DeptDao{
	
	@Insert("insert into department (departmentName) values (#{dept.departmentName})")
	public boolean addDept(Department dept);
	
	@Select("select * from department")
	public List<Department> findAll();
	
	@Select("select * from department where id = #{id}")
	public Department findById(Integer id);
}