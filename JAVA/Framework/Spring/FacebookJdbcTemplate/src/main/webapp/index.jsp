<%@ page language="java" contentType="text/html;"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Login Form</title>
</head>
<body>
<form action="insert" method="post">
		<table style="with: 50%">

			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>LastName</td>
				<td><input type="text" name="lastName" /></td>
			</tr>
			<tr>
            	<td>FirstName</td>
            	<td><input type="text" name="firstName" /></td>
            </tr>
            <tr>
                <td>Age</td>
                <td><input type="number" name="age" /></td>
            </tr>
             <tr>
                            <td>Email</td>
                            <td><input type="text" name="email" /></td>
                        </tr>
		</table>

		<input type="submit" value="Insert" /></form>
</body>
</html>
