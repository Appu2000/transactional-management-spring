package com.transactionmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long PatientNumber;
	private String Name;
	private String Age;
	private String Gender;
	private String Mobile;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String name, String age, String gender, String mobile) {
		super();
		Name = name;
		Age = age;
		Gender = gender;
		Mobile = mobile;
	}

	public long getPatientNumber() {
		return PatientNumber;
	}

	public void setPatientNumber(long patientNumber) {
		PatientNumber = patientNumber;
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
