package com.chainsys.springmvc.controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.springmvc.pojo.Appointment;
//import com.chainsys.springmvc.pojo.Appointment;
import com.chainsys.springmvc.pojo.Doctor;
import com.chainsys.springmvc.pojo.DoctorAppointmentsDTO;
import com.chainsys.springmvc.repository.DoctorRepositories;
import com.chainsys.springmvc.service.DoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService drServ;
	
	@GetMapping("/alldoctors")
	public String getAllDoctor(Model model) {
		List<Doctor> doclist=drServ.getDoctors();
		model.addAttribute("alldoc", doclist);
		return "all-doctor";
	}
	@GetMapping("/adddocform")
	public String addform(Model model) {
		Doctor doc=new Doctor();
		model.addAttribute("adddoc", doc);
		return "add-doctor-form";
	}
	@PostMapping("/adddoctor")
	public String adddoctor(@ModelAttribute("adddoc") Doctor doc){
		drServ.save(doc);
		return "redirect:/doctor/alldoctors";
	}
	@GetMapping("/updatedocform")
	public String updateform(@RequestParam("docid") int id,Model model) {
		Doctor doc=drServ.findById(id);
		model.addAttribute("updatedoc", doc);
		return "update-doctor-form";
	}
	@PostMapping("/updatedoctor")
	public String updateDoctor(@ModelAttribute("updatedoc") Doctor doc){
		drServ.save(doc);
		return "redirect:/doctor/alldoctors";
	}
	@GetMapping("/deletedoc")
	public String deleteDoctor(@RequestParam("docid") int id,Model model) {
		drServ.deleteById(id);
		return "redirect:/doctor/alldoctors";
	}
	@GetMapping("/finddocbyid")
	public String finddoctorById(@RequestParam("docid") int id,Model model) {
		Doctor doc=drServ.findById(id);
		model.addAttribute("getdoc", doc);
		return "find-doctor-id-form";
	}
	@GetMapping("/getdocapp")
	public String getAppointments (@RequestParam("id") int id,Model model) {
		DoctorAppointmentsDTO dto=drServ.getDoctorAndAppointments(id); 
		model.addAttribute("getdoc", dto.getDoctor()); 
		model.addAttribute("applist", dto.getAppointments()); 
		return "list-doctor-appointments"; 
	}
	@GetMapping("/trans")
	public void testTransaction(@RequestParam("id") int id) {
		DoctorAppointmentsDTO dto=new DoctorAppointmentsDTO();
		Doctor dr =new Doctor();
		dr.setId(id);
		dr.setDoc_name("prithivi");
		 Date dt=new Date(98,7,25);
		dr.setDob(dt);
		dr.setSpeciality("surjent");
		dr.setPhone(8545828723l);
		dr.setstandard_fees(520);
		dto.setDoctor(dr);
		List<Appointment> applist= new ArrayList<Appointment>();
		int nextAppId=drServ.getNextAppointmentId();
		for (int i=0;i<=2;i++) 
		{
		Appointment app=new Appointment();
		app.setApp_id(i);
		Date date=new Date(22,7,25);
		app.setApp_date(date);
		app.setDoc_id(id);
		app.setPatient_name("prith");
		app.setFees_collected (i*500);
		dto.addAppointment (app);
		}
		drServ.addDoctorAndAppointments(dto);
        System.out.println("Sucessfully Completed");
	}
}
