package com.chainsys.minipoject.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.dao.DoctorDao;

public class TestDoctor {
	
	public static void testGetAllDoctors(){
		List <Doctor> alldoc=DoctorDao.getAllDoctors();
		Iterator<Doctor> docItr=alldoc.iterator();
		while(docItr.hasNext()) {
			Doctor doc=docItr.next();
			System.out.print("doc_id:"+"\t"+doc.getDoc_id()+"\t"+"doc_name"+doc.getDoc_name()+"\t"+"Speciality:"+doc.getSpeciality());
			System.out.println("\t"+"Standard fees:"+doc.getStandard_fees());
		}
		
	}
	public static void testGetDoctorById() {
		Doctor doc=DoctorDao.getDoctorById(1);
		System.out.print("doc_id:"+"\t"+doc.getDoc_id()+"\t"+"doc_name"+doc.getDoc_name()+"\t"+"Speciality:"+doc.getSpeciality());
		System.out.println("\t"+"Standard fees:"+doc.getStandard_fees());
	}
	public static void testInsertDoctor() {
		Doctor doc=new Doctor();
		doc.setDoc_id(4);
		doc.setDoc_name("sasuke uchiha");
		SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
		try {
			doc.setDob(dobFormate.parse("10/02/2001"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		doc.setSpeciality("ortho");
    	doc.setDoc_city("leaf village");
    	doc.setPhone(5458769897L);
    	doc.setStandard_fees(200);
    	int result=DoctorDao.insertDoctor(doc);
    	System.out.println(result+"rows inserted");
    }
	public static void testUpdateDoctor() {
		Doctor doc = new Doctor();
		doc.setDoc_id(3);
		doc.setDoc_name("Naruto Uzumaki");
		SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
		try {
			doc.setDob(dobFormate.parse("12/03/1999"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		doc.setSpeciality("dental");
    	doc.setDoc_city("leaf village");
    	doc.setPhone(9776547453L);
    	doc.setStandard_fees(300);
    	int result=DoctorDao.updateDoctor(doc);
    	System.out.println(result+"rows updated");
	}
	public static void testdeleteDoctor() {
		int result = DoctorDao.deleteDoctor(2);
		System.out.println(result+"row deleted");
	}
	

}
