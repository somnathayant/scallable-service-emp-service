package com.ms.EMPSERVICE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.EMPSERVICE.pojo.Emp;

@Repository
public interface EmpRepo extends JpaRepository<Emp,Integer>{

}
