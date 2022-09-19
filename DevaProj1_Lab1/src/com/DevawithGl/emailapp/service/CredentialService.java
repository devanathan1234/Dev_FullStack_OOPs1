package com.DevawithGl.emailapp.service;

import com.DevawithGl.emailapp.model.Employee;

public interface CredentialService {
	
	public String generateEmailId(String fname, String lname, String dept);
	public String generatePassword();
	public void showcredentials(Employee e);

}
