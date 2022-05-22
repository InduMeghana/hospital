package com.meghana.HospitalManagement.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meghana.HospitalManagement.hospitalmodels.Doctor;
import com.meghana.HospitalManagement.hospitalmodels.Patient;
import com.meghana.HospitalManagement.services.DoctorServices;
import com.meghana.HospitalManagement.services.PatientServices;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("hospital")
public class DoctorController {
	@Autowired
	DoctorServices docservice;
	@Autowired
	PatientServices patientservices;
	@GetMapping("doctors")
	public ResponseEntity<List<Doctor>> getAllDoctors(){
		List<Doctor> doctors= docservice.getAllDoctors();
		return new ResponseEntity<List<Doctor>>(doctors, HttpStatus.OK);
	}
	@GetMapping("patient")
	public ResponseEntity<List<Patient>> getAllPatients(){
		List<Patient> patients= patientservices.getAllPatients();
		return new ResponseEntity<List<Patient>>(patients, HttpStatus.OK);
	}
	
	@PostMapping("doctors")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return docservice.createDoctor(doctor);
	}
	@PostMapping("patient")
	public Patient addPatient(@RequestBody Patient patient) {
		return patientservices.createPatient(patient);
	}
	@PostMapping("doctors/{id}")
	public Doctor update(@PathVariable Long id,@RequestBody Doctor doctor) {
		doctor.setId(id);
		return docservice.createDoctor(doctor);
	}
	@GetMapping("patient/{id}")
	public  ResponseEntity<Patient> getPatient(@PathVariable("id") long employeId){
		return new ResponseEntity<Patient>(patientservices.getPatient(employeId),HttpStatus.OK);
	}
}
