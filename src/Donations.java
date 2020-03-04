

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Donations
 */
@WebServlet("/Donations")
public class Donations extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Donations() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
		Class.forName("com.jdbc.mysql.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trackdonations","root","Chrohn2001");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("insert into donators(Name,Surname,Amount,Currency) values('George','Dialynas','150','Euros')");
		
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
