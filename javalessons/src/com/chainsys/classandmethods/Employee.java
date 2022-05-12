package com.chainsys.classandmethods;
/**
 * this is a class that contains employee related data
 * the person has id, name, city, and salary properties 
 * @author prit3136
 *created on:25 march 2022
 */

public class Employee {
	private final int empID;
	private String name;
    private String city;
    private long salary;
    //constructor
    public Employee(int id) {
    	//assigning value to readonly field
    	this.empID=id;
    }
    public String getname() {
    	return name;
    }
    public void setName(String name){
    	this.name=name;
    }
    public int getEmpID() {
    	return empID;
    	
    }
    public String getcity() {
    	return city;
    }
    public void setcity(String city) {
    	this.city=city;
    }
    public long getsalary() {
    	return salary;
    }
    public void setsalary(long salary) {
    	this.salary=salary;
    }
}
