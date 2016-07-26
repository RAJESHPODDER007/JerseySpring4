package com.eg.jersey.spring.service.impl;

import com.eg.jersey.spring.service.CustomServices;

public class CustomServiceImpl implements CustomServices {

	public CustomServiceImpl(){
		System.out.println("CustomServiceImpl");
	}
	
	@Override
	public String getMessage() {
		return "Got It! Damm  Good";
	}

}
