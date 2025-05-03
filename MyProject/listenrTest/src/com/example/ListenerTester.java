package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class ListenerTester extends HttpServlet {

		@Override
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();

				out.println("test context attributes set by listener<br>");
				out.println("<br>");

				Dog dog = (Dog) getServletContext().getAttribute("dog");
				out.println("Dog's breed: " + dog.getBreed() + "<br>");
		}
}