package com.chainsys.springmvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.springmvc.dao.EmployeeDao;
import com.chainsys.springmvc.pojo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@GetMapping("/list")
	public String getAllEmployee(Model model) {
		List<Employee> allEmployee = EmployeeDao.getAllEmployees();
		model.addAttribute("allemp", allEmployee);
		return "list-emp";
	}
	@GetMapping("/addform")
    public String showAddForm(Model model) {
		Employee theEmp=new Employee();
		model.addAttribute("addemp", theEmp);
    	return "add-emp-form";
    }
	@PostMapping("/add")
	public String addNewEmployee(@ModelAttribute("addemp") Employee emp) {
		EmployeeDao.insertEmployee(emp);
		return "redirect:/employee/list";
	}
	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("empid") int id,Model model)
	{
		Employee theEmp=EmployeeDao.getEmployeeById(id);
		model.addAttribute("updateemp", theEmp);
		return "update-emp-form";
	}
    @PostMapping("/updateemp")
	public String updateEmployees(@ModelAttribute("updateemp") Employee theEmp) {
		EmployeeDao.updateEmployee(theEmp);
		return "redirect:/employee/list";
	}
    @GetMapping("/deleteemployee")
	public String deleteEmployees(@RequestParam("empid") int id) {
		EmployeeDao.deleteEmployee(id);
		return "redirect:/employee/list";
	}
    @GetMapping("/findemployeebyid")
	public String findEmployeeById(@RequestParam("empid") int id,Model model) {
    	Employee theEmp=EmployeeDao.getEmployeeById(id);
    	model.addAttribute("findemployeebyid", theEmp);
		return "find-employee-id-form";
	}

}
