package com.ms.EMPSERVICE.service;

import java.util.List;

import com.ms.EMPSERVICE.dto.Data;

public interface EmpService {

	List<Data>getAll(Data ob);
	Data getEmpById(Integer Id);
	Data saveEmp(Data ob);
}
