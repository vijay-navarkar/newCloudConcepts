package com.fdx.rtct.scan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fdx.rtct.scan.model.DashboardModel;

@SpringBootApplication
@ComponentScan("com.fdx.rtct.scan")
@RequestMapping
public class ScanApplication {

	public static void main(String[] args) {
		System.out.println("--allocation started-----");
		SpringApplication.run(ScanApplication.class, args);
	}
	
	@RequestMapping("/m1")
	public DashboardModel method1(){
		System.out.println("ScanTestController");
		return new DashboardModel(1,2,3,"vijay");
		
	}

	@RequestMapping(path = "/method2" , method = RequestMethod.GET )
	public String method(){
		return "Scan Test Controller 2";
		
	}
	
}
