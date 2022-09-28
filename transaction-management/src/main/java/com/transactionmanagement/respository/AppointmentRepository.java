package com.transactionmanagement.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transactionmanagement.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long>{

}
