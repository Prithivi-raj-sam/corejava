package com.chainsys.springmvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.springmvc.pojo.Doctor;

public interface DoctorRepositories extends CrudRepository<Doctor, Integer> {
	Doctor findById(int id);
	Doctor save(Doctor dr);
	// used for adding a new customer and modifying the existing customer
	void deleteById(int id);
	List<Doctor> findAll();
	
}
