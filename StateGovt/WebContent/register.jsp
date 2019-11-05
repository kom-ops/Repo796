<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><br><br>
	<form action="register" method="post">
	<table>
	<tr>
		<td>CID</td>
		<td>
		<input type="text" name="cid"/>
		</td>
	</tr>
	<tr>
		<td>CName</td>
		<td><input type="text" name="cname"/></td>	
	</tr>
	<tr>
		<td>Qualification</td>
		<td><input type="text" name="qualification" /></td>	
	</tr>
	<tr>
		<td>State</td>
		<td><select name="state">
			<option>Maharashtra</option>
			<option>New Delhi</option>
			<option>Uttar Pradesh</option>
			<option>Madhya Pradesh</option>
			<option>Jharkhand</option>
			<option>Andhra Pradesh</option>
			<option>Tamil Nadu</option>
			<option>Others</option>
		</select></td>
	</tr>
	<tr>
		<td>Enddate</td>
		<td><input type="text" name="enddate" /></td>
	</tr>
	<tr>
		<td>Party</td>
		<td><select name="party">
		<option>BJP</option>
			<option>Congress</option>
			<option>Samajwadi Party</option>
			<option>Rashtrawadi Party</option>
			<option>BSP</option>
			<option>Shivsena</option>
			<option>Others</option>
		</select></td>
		
	</table>
	<input type="submit" value="Submit"/>
	</form>
	</center>
</body>
</html>