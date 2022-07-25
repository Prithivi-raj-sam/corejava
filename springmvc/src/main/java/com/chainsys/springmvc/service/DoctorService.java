package com.chainsys.springmvc.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chainsys.springmvc.pojo.Appointment;
import com.chainsys.springmvc.pojo.Doctor;
import com.chainsys.springmvc.pojo.DoctorAppointmentsDTO;
import com.chainsys.springmvc.repository.AppointmentRepository;
import com.chainsys.springmvc.repository.DoctorRepositories;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepositories repo;
	@Autowired
	private AppointmentRepository arepo;

	public List<Doctor> getDoctors() {
		List<Doctor> listDr = repo.findAll();
		return listDr;
	}

	@Transactional
	public Doctor save(Doctor dr) {
		return repo.save(dr);
	}

	public Doctor findById(int id) {
		return repo.findById(id);
	}

	@Transactional
	public void deleteById(int id) {
		repo.deleteById(id);
	}

	public DoctorAppointmentsDTO getDoctorAndAppointments(int id) {
		Doctor dr = findById(id);
		DoctorAppointmentsDTO dto = new DoctorAppointmentsDTO();
		dto.setDoctor(dr);
		List<Appointment> appointments = arepo.findByDoctorsId(id);
//		 for(int i=0;i<=5;i++) 
//	        {	
//	            Appointment app=new Appointment();
//	            app.setApp_id(i);
//	            Date dt=new Date(22,7,25);
//	            app.setApp_date(dt); 
//	            app.setDoc_id(id);
//	            app.setPatient_name("prithivi");
//	            app.setFees_collected(i*500);
//	            dto.addAppointment(app);
//	            
//	        }	
		Iterator<Appointment> itr = appointments.iterator();
		while (itr.hasNext()) {
			dto.addAppointment((Appointment) itr.next());
		}
		return dto;
	}
	@Transactional
	public void addDoctorAndAppointments(DoctorAppointmentsDTO dto) {
		Doctor dr = dto.getDoctor();
		save(dr);
		List<Appointment> appointmentList = dto.getAppointments();
		int count = appointmentList.size();
		for (int i = 0; i < count; i++) {
			arepo.save(appointmentList.get(i));
		}
	}
}
