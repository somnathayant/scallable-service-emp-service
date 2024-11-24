package com.ms.EMPSERVICE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.EMPSERVICE.pojo.Address;
import com.ms.EMPSERVICE.pojo.Emp;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer>{

}
