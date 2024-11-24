/*package com.ms.EMPSERVICE;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ms.EMPSERVICE.dto.*;

@FeignClient(name="GATEWAY-SERVER")
public interface ProjectProxy {

	@GetMapping(value="/PROJECT-SERVICE/getAllProject")
	public Data getAllFromAcct();
	
	@PostMapping("/PROJECT-SERVICEE/saveProject")
	public Data setAllToAcct(Data ob);
}
*/