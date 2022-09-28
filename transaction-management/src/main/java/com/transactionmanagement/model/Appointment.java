package com.transactionmanagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
    
	@Id
	private Long anumber;
	private Date date;
	private Long doctorNumber;
	private Long PatientNumber;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(Long anumber, Date date, Long doctorNumber, Long patientNumber) {
		super();
		this.anumber = anumber;
		this.date = date;
		this.doctorNumber = doctorNumber;
		PatientNumber = patientNumber;
	}
	public Long getAnumber() {
		return anumber;
	}
	public void setAnumber(Long anumber) {
		this.anumber = anumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getDoctorNumber() {
		return doctorNumber;
	}
	public void setDoctorNumber(Long doctorNumber) {
		this.doctorNumber = doctorNumber;
	}
	public Long getPatientNumber() {
		return PatientNumber;
	}
	public void setPatientNumber(Long patientNumber) {
		PatientNumber = patientNumber;
	}
	
	
	
}
	