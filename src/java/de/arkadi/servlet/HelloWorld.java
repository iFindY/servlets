package de.arkadi.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends GenericServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see GenericServlet#GenericServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see GenericServlet#service(ServletRequest request, ServletResponse response)
     */
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        PrintWriter out = response.getWriter();
        out.println("Java EE: Programming Servlets");

    }

}
