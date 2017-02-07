<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="frags/header.jsp"%>

<title>Slate Login</title>
</head>
<body>


	<div class="container">
		<div class="row">
			<div class="col-md-offset-6 col-md-4">
				<div class="form-login">
					<h4>Welcome to Slate Rock and Gravel Company</h4>
					<form method="POST" action="login">
						Username: <input type="text" name="username"
							class="form-control input-sm chat-input" /><br> Password: <input
							type="password" name="password"
							class="form-control input-sm chat-input" /><br> <span
							class="group-btn"> <input type="submit" value="Login"
							class="btn btn-primary btn-md">
						</span>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>