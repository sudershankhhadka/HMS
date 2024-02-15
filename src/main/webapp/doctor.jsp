<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="doctorServlet">
		Name: <input type="text"  name ="name">
		<br>
		EmailID: <input type="email" name= "email">
		<br>
		Specialization: <select id="dropdown" name="specialization">
    <option value="ortho">Ortho</option>
    <option value="opthalmology">Opthalmology</option>
    <option value="skin">Skin</option>
    <option value="maternity">Maternity</option>
	</select>
    <br>
 	Address: <input type = "text" name="Address"><br>
 	Mobile: <input type = "number" name = "Mobile"><br>
 	Gender: 
 	Female<input type = "radio" name = "Gender"><br>
 	Male<input type="radio" name ="Gender">
 	<br>
 	<br>
 	Note<input type="text" name = "note"><br>
	<input type = "submit" value = "Create">
</form>
</body>
</html>




