package com.chainsys.miniproject.entry;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.chainsys.miniproject.ui.AppointmentsUI;
import com.chainsys.miniproject.ui.DoctorUI;
import com.chainsys.miniproject.ui.EmployeeUI;

public class Startup1 {
	public static void main(String[] args) {
		load();
	}

	private static void load() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("1.To Operation with doctor details");
		System.out.println("2.To Operation with Appointment details");
		System.out.println("3.To operation with Employee details");
		int operation = 0;
		try {
			operation = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("please enter Integer value ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		switch (operation) {
		case 1:
			doctorOperations();
			break;
		case 2:
			appointmentOperation();
			break;
		case 3:
			EmpOperation();
			break;
		default:
			System.out.println("enter valid number! please try again!");
		}
		sc.close();

	}

	public static void appointmentOperation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.To add new Appointment details");
		System.out.println("2.To update already existing details");
		System.out.println("3.To delete Appointment details");
		System.out.println("4.To View all the Appointment Details");
		System.out.println("5.To view Specific Appointment details");
		int operation=0;
		try {
		operation = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Error: lease enter Integer value");
		}catch(Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
		switch (operation) {
		case 1:
			AppointmentsUI.addNewAppointments();
			break;
		case 2:
			System.out.println("1.To update All Details");
			System.out.println("2.To update patient Name");
			System.out.println("3.To update collected fees");
			int updateOperation = sc.nextInt();
			switch (updateOperation) {
			case 1:
				AppointmentsUI.updateAppDetails();
				break;
			case 2:
				AppointmentsUI.updatePatientName();
				break;
			case 3:
				AppointmentsUI.updateCollectedfees();
				break;
			default:
				System.out.println("enter valid number! please try again");
			}
			break;
		case 3:
			AppointmentsUI.deleteAppointmentDetails();
			break;
		case 4:
			AppointmentsUI.ViewAllAppointmentDetails();
			break;
		case 5:
			AppointmentsUI.viewAppointmentDetails();
			break;
		default:
			System.out.println("enter valid number! please try again");
		}
		sc.close();
	}

	public static void doctorOperations() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.To add New Doctor into Table,");
		System.out.println("2.To update already existing details,");
		System.out.println("3.To Delete records of doctors,");
		System.out.println("4.To View all doctors details,");
		System.out.println("5.To View specific doctor details");
		int operation = sc.nextInt();
		switch (operation) {
		case 1:
			DoctorUI.addNewDoctor();
			break;
		case 2:
			System.out.println("1.To update all values ");
			System.out.println("2.To update Doctor name only");
			System.out.println("3.To update Standard fees");
			int updateoperation = sc.nextInt();
			switch (updateoperation) {
			case 1:
				DoctorUI.updateDocDetails();
				break;
			case 2:
				DoctorUI.updateDoctorName();
				break;
			case 3:
				DoctorUI.updateStandardFees();
				break;
			default:
				System.out.println("enter valid number! please try again");
			}
			break;

		case 3:
			DoctorUI.deleteDoctordetails();
			break;
		case 4:
			DoctorUI.ViewAllDoctorDetails();
			break;
		case 5:
			DoctorUI.viewDoctorDetails();
			break;
		default:
			System.out.println("enter valid number! please try again");
		}
		sc.close();
	}
	private static void EmpOperation() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("1.To add New Empoloyee Details!");
		System.out.println("2.To Update already excisting Details");
		System.out.println("3.To Delete records of Employees");
		System.out.println("4.To View all Employee Details");
		System.out.println("5.To View Specific Employee Details");
		int empOp=sc.nextInt();
		switch(empOp) {
		case 1:
			EmployeeUI.addNewEmployee();
			break;
		case 2:
			System.out.println("1.To Update all employee Details");
			System.out.println("2.To Update Employee first name");
			System.out.println("3.To Update Employee Salary");
			int upop=sc.nextInt();
			switch(upop) {
			case 1:
			EmployeeUI.updateEmpDetails();
			case 2:
				EmployeeUI.updateEmployeeFirstName();
				break;
			case 3:
				EmployeeUI.updateEmployeeSalary();
				break;
			default:
				System.out.println("enter valid number");
			}
			break;
		case 3:
			EmployeeUI.deleteEmpdetails();
			break;
		case 4:
			EmployeeUI.ViewAllEmployeeDetails();
			break;
		case 5:
			EmployeeUI.viewEmployeeDetails();
		    break;
		default:
			System.out.println("enter valid number");
		}
		sc.close();
	}


}
