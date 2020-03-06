<!-- Added the proper libraries and Classes to display the data from database -->
<%@ page import="Dialynas.Donator" %>
<%@ page import="Dialynas.DataBaseConnection" %>
<%@ page import="java.util.ArrayList" %>


<html>
	
	<head>
	
		<meta charset="UTF-8">
   		 <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <title>Donators Table</title>
         
	
	</head>


	<body>
		<h4>Table with donators and details</h4>
		
		<!-- Create connection with the database and make an array list object donators -->
		<%
		DataBaseConnection dbc1=new DataBaseConnection();
		ArrayList<Donator> donators=dbc1.getDonatorDetails();
	%>
	
	<!-- The donators table derived from the database table donators -->
<table name="donators" id="donators" style="border: 1px solid black; border-collapse: collapse;">
<tr>
<th style="border: 1px solid black;">Name</th>
<th style="border: 1px solid black;">Surname</th>
<th style="border: 1px solid black;">Amount</th>
<th style="border: 1px solid black;">Currency</th>
</tr>
<!-- Loop to access the list and print -->
		<% for(Donator donator:donators) {%>
			
		<tr style="border: 1px solid black;"><td><%=donator.getName()%></td>
		<td><%=donator.getSurname()%></td>
		<td><%=donator.getAmount()%></td>
		<td><%=donator.getCurrency() %></td></tr>
			
		<%}%></table>
		
		<!-- proper buttons to export on csv and on pdf -->
		<br>
		<br>
		<div>
		<button onlick="export_table_to_csv()">
		
		Export to CSV
		
		</button>
		
		
		
		<br>
		<br>
		
		<button onlick="CreateCsv.java">
		
		Export to PDF
		
		</button>
		</div>
		<br>
		<br>
		<br>
		<a href="HomePage.jsp">Return to Home Page</a>
	
	
	
	</body>




</html>