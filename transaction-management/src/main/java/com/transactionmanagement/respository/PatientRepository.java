package com.transactionmanagement.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transactionmanagement.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long>{

}
