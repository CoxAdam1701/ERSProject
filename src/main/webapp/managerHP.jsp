<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="frags/navbar.jsp"%>
<%@ include file="frags/header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manager Homepage</title>
</head>
<body>
	<div class="container1">
		<h2 id="reimTableTitle">Reimbursments</h2>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>ID</th>
					<th>Amount</th>
					<th>Description</th>
					<th>Submit Date/Time</th>
					<th>Resolve Date/Time</th>
					<th>Submitted By (Employee ID)</th>
					<th>Resolved By (Manager ID)</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${manTableReim}" var="ReimInfo">
					<tr>
						<td>${ReimInfo.reimID}</td>
						<td>${ReimInfo.reimAmount}</td>
						<td>${ReimInfo.reimDesc}</td>
						<td>${ReimInfo.reimSubmitTime}</td>
						<td>${ReimInfo.reimResolveTime}</td>
						<td>${ReimInfo.reimAuthor}</td>
						<td>${ReimInfo.reimResolver}</td>
						<td>${ReimInfo.reimStatus}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<input class="btn btn-primary" type="button"
			value="Approve open requests">
	</div>

</body>
</html>