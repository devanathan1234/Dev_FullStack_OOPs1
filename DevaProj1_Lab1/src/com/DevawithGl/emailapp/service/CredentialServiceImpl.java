package com.DevawithGl.emailapp.service;

import java.util.Random;

import com.DevawithGl.emailapp.model.Employee;

public class CredentialServiceImpl implements CredentialService {
	private String domin;

	
	public CredentialServiceImpl(String domin) {
		super();
		this.domin = domin;
	}

	@Override
	public String generateEmailId(String fname, String lname, String dept) {
		// TODO Auto-generated method stub
		return fname+lname+"@"+dept+"."+domin;
	}

	@Override
	public String generatePassword() {
		Random r= new Random();
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i<8; i++)
		{
			int n= r.nextInt(127-32)+32;
			sb.append((char)n);
		}
		return sb.toString();
	}

	@Override
	public void showcredentials(Employee e) {
		System.out.println("Dear, "+ e.getFirstName()+ " Your generated credentials are as follows");
		System.out.println("Email -->  "+e.getEmailId());
		System.out.println("Password -->  " + e.getPassword());
		
	}
	

}
