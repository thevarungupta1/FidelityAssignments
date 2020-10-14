<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class ="container">
<h1>Contact Us</h1>
	<form action="submit" method="post">
	
		<div class="form-group">
			<label >Name</label>
			<input class="form-control" name="userName" type="text" placeholder="Plaese enter name"/>
		</div>
		<div class="form-group">
			<label >Email</label>
			<input class="form-control" name="email" type="text" placeholder="Plaese enter email"/>
		</div>
		<div class="form-group">
			<label >Phone</label>
			<input class="form-control" name="phone" type="text" placeholder="Plaese enter phone"/>
		</div>
		<input type="submit" value="submit" class="btn btn-primary"/>
	</form>

</div>

</body>
</html>