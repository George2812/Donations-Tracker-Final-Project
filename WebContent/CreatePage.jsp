<%@page import="java.sql.*" %>


<html>
	<head>
		 <meta charset="UTF-8">
   		 <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <title>Create Donation</title>
	

    </head>

	<body>
		<h4 style="text-align:center">Insert your personal details and amount and then click submit</h3>
		<br>
		<br>
		<br>
		<!--Create Donator's form table and submit button -->
	
				<form action="Donations" method="GET">
				<table style="background-color:skyblue;padding: 15px;">
				<tr>
				<td>First Name</td>
				<td><input type="text" id="name" name="First Name" /></td>
				</tr>
				<tr>
				<td>Last Name</td>
				<td><input type="text" id="lname" name="Last Name" /></td>
				</tr>
				<tr>
				<td>Amount</td>
				<td><input type="text" id="amount" name="Amount" /></td>
				</tr>
				<tr>
				<td>Currency</td>
				<td><input type="text" id="currency"name="Currency" /></td>
				</tr>
				</table>
		<br>
		<input type="submit" id="submit" value="Submit">
		
		</form>
		<br>
		<br>
		<br>
	<a href="HomePage.jsp">Return to Home Page</a>
	</body>
	
	
	<form></form>
	
	

</html>