package com.transactionmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transactionmanagement.controller.form.Appointmentform;
import com.transactionmanagement.model.Patient;
import com.transactionmanagement.respository.PatientRepository;
import com.transactionmanagement.service.BookAppointmentService;

@RestController
@ComponentScan 
public class BookAppointment {
	
	@Autowired
	private BookAppointmentService bookAppointmentService;
	
	@Autowired
	private PatientRepository patRepo;
	
	@PostMapping("/add")
	public String bookAppointment(@RequestBody Appointmentform appointmentform) {
		return bookAppointmentService.bookAppointment(appointmentform);
		
	}
	
	@GetMapping("/test")
	public String test() {
		return "we get it";
		
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Patient>> getAll(){
		return ResponseEntity.ok(patRepo.findAll());
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Patient> findById(@PathVariable Long id){
		
		return ResponseEntity.ok(patRepo.findById(id).orElse(null));
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Patient> update(@RequestBody Patient pat){
		
		return ResponseEntity.ok(patRepo.save(pat));	
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Patient> delete(@PathVariable Long id){
		
		patRepo.findById(id).ifPresent(patRepo::delete);
		return ResponseEntity.ok().build();	
	}

//	@PutMapping("/update")
//	public ResponseEntity<Employee> update(@RequestBody Employee employee) {
//		return ResponseEntity.ok(employeeservice.save(employee));
//	}
//
//	@DeleteMapping("/delete/{id}")
//	public ResponseEntity<Employee> delete(@PathVariable Long id) {
//		employeeservice.findById(id).ifPresent(employeeservice::delete);
//		return ResponseEntity.ok().build();
//	}
	

}
