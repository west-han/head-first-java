package com.example.web;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.ArrayList;

import com.example.model.BeerExpert;

public class BeerSelect extends HttpServlet {
	private BeerExpert BeerExpert = new BeerExpert();

	public void doPost(HttpServletRequest request, 
										HttpServletResponse response) 
										throws ServletException, IOException {

		String c = request.getParameter("color");
		ArrayList<String> brands = BeerExpert.getBrands(c);

		request.setAttribute("styles", brands);
		RequestDispatcher view = 
			request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}

	
}