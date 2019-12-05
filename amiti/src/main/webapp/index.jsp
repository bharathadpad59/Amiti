<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<html>
<body>
	<!-- <form action="calculation" method="get">  -->
	<form action="calculation" >
		<h3>CALCULATION</h3>
		${num1}
		<input type="number" name="A1" placeholder="Enter 1st value"><br> 
		<input type="number" name="A2" placeholder="Enter 2nd value"><br>

		<select name="operations">
			<option value="ADDITION">ADDITION</option>
			<option value="SUBSTRACTION">SUBSTRACTION</option>
			<option value="MULTIPLICATION">MULTIPLICATION</option>
			<option value="DIVSION">DIVSION</option>
		</select> 
		<input type="submit" value="submit" name="btn">
		
	</form>



		<!-- <h3>SUBSTRACTION</h3>
<input type="number" name="S1"  placeholder="Enter GREATER value"> <br>
<input type="number" name="S2" placeholder="Enter LEAST value"><br>
<input type="submit" value="submit" name="btn"> -->


		<!-- <input type="submit" value="5" name="btn1" > -->



	
	
	
	<h2 style="color: red;">
		Values are =
		<h3 style="font-family: verdana;">${no1},
			${no2};
			</h1>
	</h2>
	<h2 style="color: green;">
		Result Answer is =
		<h3 style="color: blue;">${Resultadd};</h3>
	</h2>
</body>
</html>
