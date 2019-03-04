package com.pelter.data.model;

import java.util.Date;

public class Person {
	private String firstname;
	private String lastname;
	private String birthplace;
	private Date birtdate;
	private GenderType gender;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	public Date getBirtdate() {
		return birtdate;
	}
	public void setBirtdate(Date birtdate) {
		this.birtdate = birtdate;
	}	
	
	public GenderType getGender() {
		return this.gender;
	}
	public void setGender(GenderType gender) {
		this.gender = gender;
	}
	
	public enum GenderType { MALE, FEMALE, UNDEFINED };
}
