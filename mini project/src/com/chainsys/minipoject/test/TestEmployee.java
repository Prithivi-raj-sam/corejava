package com.chainsys.minipoject.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class TestEmployee {
	public static void testGetAllEmployees() {
		List <Employee> allEmployees=EmployeeDao.getAllEmployees();
		Iterator<Employee> empIterator=allEmployees.iterator();
		while(empIterator.hasNext()) {
			Employee emp=empIterator.next();
			System.out.println(emp.getJob_id()+" "+emp.getFirst_name()+" "+emp.getSalary());
		}
		
	}
	public static void testGetEmployeeById() {
		Employee emp=EmployeeDao.getEmployeeById(101);
		System.out.println(emp.getJob_id()+" " + emp.getFirst_name());
	}
    public static void testInsertEmployee() {
    	Employee newemp=new Employee();
    	newemp.setEmployee_id(300);
    	newemp.setFirst_name("ana");
    	newemp.setLast_name("Rose");
    	newemp.setEmail("ana23@mail.com");
    	Calendar c1=Calendar.getInstance();
    	java.util.Date newDate=c1.getTime();
    	newemp.setHire_date(newDate);
    	newemp.setJob_id("IT_PROG");
    	newemp.setSalary(75000);
    	int result=EmployeeDao.insertEmployee(newemp);
    	System.out.println(result+"rows inserted");
    }
    public static void testUpdateEmployee() 
    {
    	Employee oldEmployee=EmployeeDao.getEmployeeById(126);
    	System.out.println(oldEmployee.getEmployee_id()+" "+ oldEmployee.getFirst_name()+" "+oldEmployee.getLast_name());
    	oldEmployee.setEmployee_id(300);
    	oldEmployee.setFirst_name("ana");
    	oldEmployee.setLast_name("Rose");
    	oldEmployee.setEmail("ana23@mail.com");
    	Calendar c1=Calendar.getInstance();
    	java.util.Date newDate=c1.getTime();
    	oldEmployee.setHire_date(newDate);
    	oldEmployee.setJob_id("IT_PROG");
    	oldEmployee.setSalary(75000);
    	int result=EmployeeDao.updateEmployee(oldEmployee);
    	System.out.println(result+"rows updated");
    }
    public static void testdeleteEmployee() {
    	int result=EmployeeDao.deleteEmployee(126);
    	System.out.println(result + "rows deleted");
    }
}
