package com.meghana.HospitalManagement.services;



import java.util.List;

import org.springframework.stereotype.Service;

import com.meghana.HospitalManagement.hospitalmodels.Patient;
@Service
public interface PatientServices {
	public List<Patient> getAllPatients();
	public Patient createPatient(Patient patient);
	public Patient getPatient(long id);
}
