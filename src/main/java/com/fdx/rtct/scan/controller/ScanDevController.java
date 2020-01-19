package com.fdx.rtct.scan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fdx.rtct.scan.model.DashboardModel;

@RestController
@RequestMapping("/dev")
public class ScanDevController {
	
	@RequestMapping(path = "/method1" , method = RequestMethod.GET   )
	public DashboardModel method2(){
		System.out.println("ScanDevController");
		return new DashboardModel(1,2,3,"vijay");
		
	}

}
