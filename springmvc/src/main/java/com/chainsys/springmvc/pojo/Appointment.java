package com.chainsys.springmvc.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="appointments")
public class Appointment {
	@Id
	private int app_id;
	private Date app_date;
	private int doc_id;
	private String patient_name;
	private float fees_collected;
	private String fees_category;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doc_id", nullable= false, insertable=false, updatable=false)
	@JsonIgnore
	private Doctor doctors; 

	public Doctor getDoctors() {
		return this.doctors;
	}

	public void setDoctors(Doctor doc) {
		this.doctors = doc;
	}
	public int getApp_id() {
		return app_id;
	}
	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}
	public Date getApp_date() {
		return app_date;
	}
	public void setApp_date(Date app_date) {
		this.app_date = app_date;
	}
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public float getFees_collected() {
		return fees_collected;
	}
	public void setFees_collected(float fees_collected) {
		this.fees_collected = fees_collected;
	}
	public String getFees_category() {
		return fees_category;
	}
	public void setFees_category(String fees_category) {
		this.fees_category = fees_category;
	}
	
}
