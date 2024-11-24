package com.ms.EMPSERVICE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.EMPSERVICE.pojo.Emp;
import com.ms.EMPSERVICE.pojo.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project,Integer>{

}
