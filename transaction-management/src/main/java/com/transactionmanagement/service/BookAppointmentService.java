package com.transactionmanagement.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.transactionmanagement.controller.form.Appointmentform;
import com.transactionmanagement.model.Appointment;
import com.transactionmanagement.model.Patient;
import com.transactionmanagement.respository.AppointmentRepository;
import com.transactionmanagement.respository.PatientRepository;

@Service
public class BookAppointmentService {
	
	
	@Autowired
    private AppointmentRepository appointmentrepo; 
	@Autowired
	private PatientRepository patientrepo;
	
	public String bookAppointment(Appointmentform appointmentform) {
		
		Patient pt=new ObjectMapper().convertValue(appointmentform,Patient.class);
		
		Long ptNumber=patientrepo.save(pt).getPatientNumber();
		
		System.out.println("Patient saved Sucessfully");
		
		Appointment at=new Appointment(1L,new Date(System.currentTimeMillis()),100L,ptNumber);
		
		Long atNumber=appointmentrepo.save(at).getAnumber();
		
		return "Appointment Confirmed.. "+atNumber;
			
	}
}
