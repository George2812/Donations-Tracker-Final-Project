package Dialynas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CreateCsv {

	public static void main(String[] args) {
		
		try {
			PrintWriter pw=new PrintWriter(new File("D:\\GeorgeD\\donators.csv"));
			StringBuilder sb=new StringBuilder();
			
			DataBaseConnection dbc=new DataBaseConnection();
			dbc.createConnection();
			dbc.getDonatorDetails();
			ResultSet rs=null;
			
			ArrayList<Donator> donator=dbc.getDonatorDetails();
			
			for(Donator donators:donator) {
				
				sb.append(donators.toString());
			}
		
			pw.write(sb.toString());
			pw.close();
			System.out.println("finished");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
		

	
	
		
		
	}

}
