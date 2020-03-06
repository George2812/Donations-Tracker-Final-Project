//import the proper classes and libraries for the servlet
package Dialynas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Donations")
public class Donations extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Donations() {
    	
    	
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	
	}

	//create communication and post the data to the database through post method
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String i=request.getParameter("Name");
		String j=request.getParameter("Surname");
		double k=Double.parseDouble(request.getParameter("Amount"));
		String m=request.getParameter("Currency");
		
		
		Donator ds=new Donator(i,j,k,m);
		
		
		
		DataBaseConnection dbs=new DataBaseConnection();
		
		dbs.insertDonator(ds);
		//send a response page if the registration is successful
		RequestDispatcher dispatcher=request.getRequestDispatcher("/SuccessfulRegistration.jsp");
		dispatcher.forward(request, response);
		
	
	}

}
