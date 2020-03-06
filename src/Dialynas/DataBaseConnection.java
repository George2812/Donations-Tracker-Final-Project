//Database Connection with two methods ,register Donator and get donator's data back

package Dialynas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseConnection {

	public static void main(String[] args){
		

	}
	
	void createConnection() {
		
		//create the connection
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/donations?serverTimezone=UTC","root","admin");
			
			
		} catch (ClassNotFoundException e) {
			
			Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE,null,e);
			
		} catch (SQLException e) {
			
			Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE,null,e);
		}
	}
	//create array list with donator objects and retrieve the data from data base
	
	public ArrayList<Donator> getDonatorDetails(){
		
		ArrayList<Donator> donator=new ArrayList<>();
		//proper query to take the data from donations database
		String query="SELECT name,surname,amount,currency FROM donations.donators";
		   
		try (Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/donations?serverTimezone=UTC","root","admin");
			Statement smt=con.prepareStatement(query);
			ResultSet rs=smt.executeQuery(query)){
			
			while(rs.next()) {
				donator.add(new Donator(rs.getString("name"),rs.getString("surname"),rs.getDouble("amount"),rs.getString("currency")));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return donator;
	}
	
	//register the donator
	public void insertDonator(Donator donator) {
		//proper query to insert object into donators table
		final String query="INSERT INTO donations.donators(name,surname,amount,currency) VALUES (?,?,?,?)";
		try {
			try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/donations?serverTimezone=UTC","root","admin");
					PreparedStatement smt=con.prepareStatement(query)){
				//make the connection and statement
				smt.setString(1, donator.getName());
				smt.setString(2, donator.getSurname());
				smt.setDouble(3, donator.getAmount());
				smt.setString(4, donator.getCurrency());
				smt.executeUpdate();
			
		} 
		}catch (SQLException e) {
			Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE,null,e);
			
		}  
			
		       
	
		}
		
	}




