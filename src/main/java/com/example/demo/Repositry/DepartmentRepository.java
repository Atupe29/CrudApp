package com.example.demo.Repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Department;
 
@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
     
}