package com.d3.dev.apps.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	
	@Id private String id;
	
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}