package com.ms.EMPSERVICE.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.EMPSERVICE.FeignProxy;
import com.ms.EMPSERVICE.dto.Data;
import com.ms.EMPSERVICE.service.EmpService;



@RequestMapping("/EMP-SERVICE")
@RestController
public class EmpController {

	
	@Autowired
	private EmpService empSrevice;
	
	@Autowired
	private FeignProxy acctProxy;
	
	@GetMapping("/")
	public String ping() {
		return "ok";
	}
	@GetMapping("/getAll")
	public ResponseEntity<Data>getAll(){
		Data ob=new Data();
		ob=acctProxy.getAllFromAcct();
		return new ResponseEntity<Data>(ob,HttpStatus.OK);
		
	}
	@GetMapping("/getEmpById/{empId}")
	public ResponseEntity<Data>getEmpById(@PathVariable("empId")Integer empId){
		Data ob=new Data();
		ob=acctProxy.getAllFromAcct();
		return new ResponseEntity<Data>(ob,HttpStatus.OK);
		
	}
	@PostMapping("/saveEmp")
	public ResponseEntity<Data>saveEmp(@RequestBody Data ob){
		HttpStatus httpStatus=null;
		ResponseEntity<Data> res=null;
		System.out.println("project data"+ ob);
		try {
		res=acctProxy.saveAcct(ob);
		if(res.getBody().getAcctId()!=null) {
			System.out.println("data acc-emp"+ ob);
			ob.setAcctId(res.getBody().getAcctId());
			httpStatus=HttpStatus.OK;
		}else {
			httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
		}
		System.out.println("data acc-emp"+ ob);
		res=acctProxy.saveProject(ob);
		if(res.getBody().getProjectId()!=null) {
			ob.setProjectId((res.getBody().getProjectId()));
			httpStatus=HttpStatus.OK;
		}else {
			httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
		}
		System.out.println("data "+ ob);
		ob=empSrevice.saveEmp(ob);
		System.out.println("data "+ ob);
		httpStatus=HttpStatus.OK;
		}catch(Exception ex) {
			httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<Data>(ob,httpStatus);
		
	}
	
}
