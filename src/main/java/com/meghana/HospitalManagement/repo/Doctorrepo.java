package com.meghana.HospitalManagement.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meghana.HospitalManagement.hospitalmodels.Doctor;

@Repository
public interface Doctorrepo extends CrudRepository<Doctor,Long>{

}
