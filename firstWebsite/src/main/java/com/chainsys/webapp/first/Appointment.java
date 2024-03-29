package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.ExceptionManager;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.AppointmentsDao;
import com.chainsys.miniproject.pojo.Appointments;

/**
 * Servlet implementation class Appointment
 */
public class Appointment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Appointment() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		List<Appointments> applist = AppointmentsDao.getAllAppointments();
		Iterator<Appointments> appItr = applist.iterator();

		if (request.getParameter("input").equals("yes")) {
			response.setContentType("text/html");
			out.print("<html><head><title><Appointments</title></head><body>");
			out.print("<table border=1px bgcolor=\"DodgerBlue\" width=50%>");
			out.print("<tr bgcolor=\"DarkSlateBlue\" align=center>");
			out.print("<th height=\"10\" width=\"90\">App_id:</th>");
			out.print("<th height=\"10\" width=\"90\">Doc_id:</th>");
			out.print("<th height=\"10\" width=\"90\">Patient_name:</th>");
			while (appItr.hasNext()) {
				out.print("<tr align=center>");
				Appointments app = appItr.next();
				out.print("<td bgcolor=\"DeepSkyBlue\">" + app.getApp_id() + "</td>");
				out.print("<td bgcolor=\"DeepSkyBlue\">" + app.getDoc_id() + "</td>");
				out.print("<td bgcolor=\"DeepSkyBlue\">" + app.getPatient_name() + "</td>");
				out.print("</tr>");
			}
		} else
			out.println(" <br><h3>thank you for processing with us</h3>");
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("change").equals("Add")) {
			PrintWriter out = response.getWriter();
			String source = "AddNewAppointments";
			String message = "<h1>Error while " + source + "</h1>";
			Appointments app = new Appointments();
			String app_id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(app_id);
			} catch (InvalidInputDataException e) {
				message += " Error in Appointment id input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			int id = Integer.parseInt(app_id);
			try {
				Validator.CheckNumberForGreaterThanZero(id);
			} catch (InvalidInputDataException e) {
				message += " Error in Appointment id input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}

			app.setApp_id(id);

			SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
			String app_date = request.getParameter("appdate");
			try {
				Validator.checkDate(app_date);
				Validator.checkAppointmentDate(app_date);
			} catch (InvalidInputDataException e) {
				message += " Error in Appointment date input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			try {
				app.setApp_date(appFormate.parse(app_date));
			} catch (ParseException e) {
				message += " Error in Appointment Date input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			String doc_Id = request.getParameter("docid");
			try {
				Validator.checkStringForParseInt(doc_Id);
			} catch (InvalidInputDataException e) {
				message += " Error in Doctor id input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			int doctor_id = Integer.parseInt(doc_Id);
			try {
				Validator.CheckNumberForGreaterThanZero(doctor_id);
			} catch (InvalidInputDataException e) {
				message += " Error in Doctor id input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			app.setDoc_id(doctor_id);

			String patient = request.getParameter("name");
			try {
				Validator.checkStringOnly(patient);
			} catch (InvalidInputDataException e) {
				message += " Error in Patient Name input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			app.setPatient_name(patient);
			String fees_collected = request.getParameter("fees");
			try {
				Validator.checkStringForParseInt(fees_collected);
			} catch (InvalidInputDataException e) {
				message += " Error in Fees collected input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			float fees = Integer.parseInt(fees_collected);

			try {
				Validator.CheckNumberForGreaterThanZero(fees);
			} catch (InvalidInputDataException e) {
				message += " Error in Fees collected input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			app.setFees_collected(fees);
			String fees_cat = request.getParameter("feesCat");
			try {
				Validator.checkStringOnly(fees_cat);
			} catch (InvalidInputDataException e) {
				message += " Error in Fees category input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			app.setFees_category(fees_cat);
			int result = AppointmentsDao.insertAppointments(app);
			out.println(result + "row inserted");
			try {
				out.close();
			} catch (Exception e) {
				message += "  Error while inserting record </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
		} else if (request.getParameter("change").equals("update")) {
			doPut(request, response);
		} else if (request.getParameter("change").equals("Delete")) {
			doDelete(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String source = "UpdateAppointments";
		String message = "<h1>Error while " + source + "</h1>";
		Appointments app = new Appointments();
		String app_id = request.getParameter("id");
		try {
			Validator.checkStringForParseInt(app_id);
		} catch (InvalidInputDataException e) {
			message += " Error in Appointment id input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		int id = Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		} catch (InvalidInputDataException e) {
			message += " Error in Appointment id input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}

		app.setApp_id(id);

		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = request.getParameter("appdate");
		try {
			Validator.checkDate(app_date);
			Validator.checkAppointmentDate(app_date);
		} catch (InvalidInputDataException e) {
			message += " Error in Appointment date input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		try {
			app.setApp_date(appFormate.parse(app_date));
		} catch (ParseException e) {
			message += " Error in Appointment date input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		String doc_Id = request.getParameter("docid");
		try {
			Validator.checkStringForParseInt(doc_Id);
		} catch (InvalidInputDataException e) {
			message += " Error in Doctor id input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		int doctor_id = Integer.parseInt(doc_Id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		} catch (InvalidInputDataException e) {
			message += " Error in Doctor id input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		app.setDoc_id(doctor_id);

		String patient = request.getParameter("name");
		try {
			Validator.checkStringOnly(patient);
		} catch (InvalidInputDataException e) {
			message += " Error in Patient Name input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		app.setPatient_name(patient);
		String fees_collected = request.getParameter("fees");
		try {
			Validator.checkStringForParseInt(fees_collected);
		} catch (InvalidInputDataException e) {
			message += " Error in fees collected input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		float fees = Integer.parseInt(fees_collected);

		try {
			Validator.CheckNumberForGreaterThanZero(fees);
		} catch (InvalidInputDataException e) {
			message += " Error in fees Collected input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		app.setFees_collected(fees);
		String fees_cat = request.getParameter("feesCat");
		try {
			Validator.checkStringOnly(fees_cat);
		} catch (InvalidInputDataException e) {
			message += " Error in fees Category input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		app.setFees_category(fees_cat);
		int result = AppointmentsDao.updateAppointments(app);
		out.println(result + "row Updated");
		try {
			out.close();
		} catch (Exception e) {
			message += " Error while Updating record </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String source = "DeleteAppointments";
		String message = "<h1>Error while " + source + "</h1>";
		String app_id = request.getParameter("id");
		try {
			Validator.checkStringForParseInt(app_id);
		} catch (InvalidInputDataException e) {
			message += " Error in Appointment id input </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		int id = Integer.parseInt(app_id);
		int result = AppointmentsDao.deleteAppointments(id);
		out.println(result + "row deleted");
		try {
			out.close();
		} catch (Exception e) {
			message += "Error while Updating record </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
	}

}
