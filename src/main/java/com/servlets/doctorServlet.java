package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Doctor;
import com.service.doctorService;
import com.service.doctorServiceImpl;

/**
 * Servlet implementation class doctorServlet
 */
@WebServlet("/doctorServlet")
public class doctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public doctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("doctor.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String mail = request.getParameter("email");
		String specialization = request.getParameter("specialization");
		String address = request.getParameter("Address");
		String mobile = request.getParameter("Mobile");
		String gender = request.getParameter("Gender");
		String note = request.getParameter("note");
		
		//send data to the database 
		
		Doctor df = new Doctor();
		df.setName(name);
		df.setEmailId(mail);
		df.setAddress(address);
		df.setGender(gender);
		df.setNote(note);
		df.setSpecialization(specialization);
		df.setMobile(mobile);
		
		doctorService du = new doctorServiceImpl();
		du.doctorInformation(df);
		
		request.getRequestDispatcher("doctor.jsp").forward(request, response);
		
		
	
		
		
	}

}

