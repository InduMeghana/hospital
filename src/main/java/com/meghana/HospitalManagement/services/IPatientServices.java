package com.meghana.HospitalManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meghana.HospitalManagement.exception.ResourceNotFoundException;
import com.meghana.HospitalManagement.hospitalmodels.Patient;
import com.meghana.HospitalManagement.repo.Patientrepo;
@Service
public class IPatientServices implements PatientServices{
	@Autowired
	Patientrepo patientinfo;
	@Override
	public List<Patient> getAllPatients() {
		return (List<Patient>) patientinfo.findAll();
	}
	public Patient createPatient(Patient patient) {
		return patientinfo.save(patient);
	}
	@Override
	public  Patient getPatient(long id){
		Optional<Patient> patient=patientinfo.findById(id);
		if(patient.isPresent()) {
			return patient.get();
		}
		else {
			throw new ResourceNotFoundException("Patient","id",id);
		}
	}
}
