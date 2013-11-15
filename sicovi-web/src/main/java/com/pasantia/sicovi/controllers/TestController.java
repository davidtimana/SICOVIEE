package com.pasantia.sicovi.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.pasantia.sicovi.testbo.TestBO;


@Named
@SessionScoped
public class TestController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3651716881384477622L;
	private String test;
	@Inject
	private TestBO testBO;
	
	

	public TestController(String test) {
		this.test = test;
	}
	
	public TestController() {
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
}
