package com.gul.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {

	private String firstName;
	private String lastName;
	private String country;

	List<String> countryOptions;

	public StudentTwo() {
		countryOptions = new ArrayList<String>();
		countryOptions.add("India");
		countryOptions.add("Pakistan");
		countryOptions.add("U.A.E.");
		countryOptions.add("China");
		countryOptions.add("Sri Lanka");
		countryOptions.add("Japan");
		countryOptions.add("Brazil");
		countryOptions.add("Nepal");
	}

	public List<String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(List<String> countryOptions) {
		this.countryOptions = countryOptions;
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
