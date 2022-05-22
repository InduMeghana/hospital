package com.meghana.HospitalManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meghana.HospitalManagement.hospitalmodels.Doctor;
import com.meghana.HospitalManagement.repo.Doctorrepo;
@Service
public class IDoctorServices implements DoctorServices{
	
	@Autowired
	Doctorrepo docinfo;

	@Override
	public List<Doctor> getAllDoctors() {
		return  (List<Doctor>) docinfo.findAll();
	}
	public Doctor createDoctor(Doctor doc) {
		return docinfo.save(doc);
	}

}
