package com.transactionmanagement.controller.form;

import java.util.Date;

public class Appointmentform {
	private String Name;
	private String Age;
	private String Gender;
	private String Mobile;
	public Appointmentform() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointmentform(String name, String age, String gender, String mobile) {
		super();
		Name = name;
		Age = age;
		Gender = gender;
		Mobile = mobile;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	
	
	
}
