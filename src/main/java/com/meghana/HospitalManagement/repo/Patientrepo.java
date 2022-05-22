package com.meghana.HospitalManagement.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meghana.HospitalManagement.hospitalmodels.Patient;

@Repository
public interface Patientrepo extends CrudRepository<Patient,Long> {

}
