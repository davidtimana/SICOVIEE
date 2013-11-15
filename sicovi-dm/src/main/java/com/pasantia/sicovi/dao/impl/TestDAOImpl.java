package com.pasantia.sicovi.dao.impl;



import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Named;

import com.pasantia.sicovi.dao.TestDAO;


@Named
@Stateless
public class TestDAOImpl implements TestDAO, Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -4769225059072788065L;

	@Override
	public void testDAOfunction() {
	 System.out.println("en testDAOfunction");		
	}

}
