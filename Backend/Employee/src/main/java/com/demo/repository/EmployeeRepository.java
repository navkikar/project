package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	//all spring query related with crud

}
