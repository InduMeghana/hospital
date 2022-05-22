package com.meghana.HospitalManagement.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.meghana.HospitalManagement.hospitalmodels.Doctor;

@Service
public interface DoctorServices {
	public List<Doctor> getAllDoctors();
	public Doctor createDoctor(Doctor doc);
}
