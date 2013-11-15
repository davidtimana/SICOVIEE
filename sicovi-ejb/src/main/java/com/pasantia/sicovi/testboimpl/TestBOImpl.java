package com.pasantia.sicovi.testboimpl;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

import com.pasantia.sicovi.dao.TestDAO;
import com.pasantia.sicovi.testbo.TestBO;


@Named
@Stateless
public class TestBOImpl implements TestBO, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -22888246248524651L;
	@Inject
	private TestDAO testDAO;

	@Override
	public void testBOfunction() {
		System.out.println("En TestBOImpl");
		testDAO.testDAOfunction();
	}
	

}
