package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class MyServletContextListener implements ServletContextListener {

		@Override
		public void contextInitialized(ServletContextEvent event) {
				ServletContext sc = event.getServletContext();
				String dogBreed = sc.getInitParameter("breed");
				Dog dog = new Dog(dogBreed);
				sc.setAttribute("dog", dog);
		}

		@Override
		public void contextDestroyed(ServletContextEvent sce) {
				
		}
}