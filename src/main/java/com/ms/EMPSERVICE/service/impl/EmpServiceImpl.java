package com.ms.EMPSERVICE.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.EMPSERVICE.dto.Data;
import com.ms.EMPSERVICE.pojo.Acct;
import com.ms.EMPSERVICE.pojo.Address;
import com.ms.EMPSERVICE.pojo.Emp;
import com.ms.EMPSERVICE.pojo.Project;
import com.ms.EMPSERVICE.repository.AddressRepo;
import com.ms.EMPSERVICE.repository.EmpRepo;
import com.ms.EMPSERVICE.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpRepo empRepo;
	@Autowired
	private AddressRepo addrepo;
	@Override
	public List<Data> getAll(Data ob) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Data getEmpById(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public Data saveEmp(Data ob) {
		// TODO Auto-generated method stub
		Emp e=new Emp();
		e.setName(ob.getName());
		e.setAcctId(ob.getAcctId());
		e.setProjectId(ob.getProjectId());
		Address ad=new Address();
		ad.setCity(ob.getCity());
		ad.setState(ob.getState());
		e.setAddress(ad);
		
		addrepo.save(e.getAddress());
		empRepo.save(e);
		 ob.setEmpid(e.getEmpid());
		 ob.setAddressId(e.getAddress().getAddressId());
		 
		 return ob;
	}

}
