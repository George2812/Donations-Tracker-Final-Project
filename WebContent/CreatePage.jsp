


<html>
	<head>
		 <meta charset="UTF-8">
   		 <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <title>Create Donation</title>
	

    </head>

	<body>
		<h4 style="text-align:center">Insert your personal details and amount and then click submit</h4>
		<br>
		<br>
		<br>
		<!--Create Donator's registration and submit button -->
	
				<form action="./Donations" method="POST">
				<table style="background-color:skyblue;padding: 15px;">
				<tr>
				<td>First Name</td>
				<td><input type="text" id="name" name="Name" /></td>
				</tr>
				<tr>
				<td>Last Name</td>
				<td><input type="text" id="sname" name="Surname" /></td>
				</tr>
				<tr>
				<td>Amount</td>
				<td><input type="number" id="amount" name="Amount" /></td>
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