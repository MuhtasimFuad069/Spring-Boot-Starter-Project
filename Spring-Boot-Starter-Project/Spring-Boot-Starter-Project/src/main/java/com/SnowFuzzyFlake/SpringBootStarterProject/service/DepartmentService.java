package com.SnowFuzzyFlake.SpringBootStarterProject.service;

import com.SnowFuzzyFlake.SpringBootStarterProject.entity.Department;
import com.SnowFuzzyFlake.SpringBootStarterProject.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
   public  Department saveDepartment(Department department);

   public List<Department> getDepartmentList();

   public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException;

   public void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);

   public Department getDepartmentByName(String departmentName);
}
