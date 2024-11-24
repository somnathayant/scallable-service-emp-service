package com.ms.EMPSERVICE;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ms.EMPSERVICE.dto.*;

@FeignClient(name="GATEWAY-SERVER")
public interface FeignProxy {

	@GetMapping(value="/ACCT-SERVICE/getAllAcct")
	public Data getAllFromAcct();
	
	@PostMapping("/ACCT-SERVICE/saveAcct")
	public ResponseEntity<Data> saveAcct(Data ob);
	
	@GetMapping(value="/PROJECT-SERVICE/getAllProject")
	public Data getAllProject();
	
	@PostMapping("/PROJECT-SERVICE/saveProject")
	public ResponseEntity<Data> saveProject(Data ob);
}
