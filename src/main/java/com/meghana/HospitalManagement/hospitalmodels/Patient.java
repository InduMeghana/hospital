package com.meghana.HospitalManagement.hospitalmodels;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="patientname")
	private String name;
	@Column(name="visiteddoctor")
	private String visiteddoctor;
	@Column(name="dateofvisit")
	private Date date;
	public Patient() {}
	public Patient(String name, String visiteddoctor, Date date) {
		super();
		this.name = name;
		this.visiteddoctor = visiteddoctor;
		this.date = date;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVisiteddoctor() {
		return visiteddoctor;
	}
	public void setVisiteddoctor(String visiteddoctor) {
		this.visiteddoctor = visiteddoctor;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
