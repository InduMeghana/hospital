package com.meghana.HospitalManagement;


/*import org.springframework.beans.factory.annotation.Autowired;*/
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*import com.meghana.HospitalManagement.hospitalmodels.Doctor;
import com.meghana.HospitalManagement.hospitalmodels.Patient;
import com.meghana.HospitalManagement.services.DoctorServices;
import com.meghana.HospitalManagement.services.PatientServices;*/


@SpringBootApplication
public class HospitalManagementApplication implements CommandLineRunner{

	/*@Autowired
	PatientServices patient;*/
	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementApplication.class, args);
	}
	public void run(String... args) throws Exception{
	}
}
