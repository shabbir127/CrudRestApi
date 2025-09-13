package com.sk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer > 
{
	

}
