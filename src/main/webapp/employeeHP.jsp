<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="frags/navbar.jsp"%>
<%@ include file="frags/header.jsp"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Homepage</title>
</head>
<body>
	<div class="container1" id="reimTable">
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
				<c:forEach items="${empTableReim}" var="ReimInfo">
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
		<form method="POST" id="newReim">
			<input type="button" value="Create New" id="newReimButton"
				class="btn btn-primary btn-md" />
			<div class="form-group">
				<label for="formGroupExampleInput">Amount</label> <input
					type="number" class="form-control" id="amountInput"
					placeholder="Amount in US dollars" name="theAmt">
			</div>
			<div class="form-group">
				<label for="exampleTextarea">Description</label>
				<textarea class="form-control" id="Textarea" rows="4" name="theDesc"></textarea>
			</div>
			<div class="form-group">
				<label for="exampleSelect1" id="reimType">Categories</label> <select
					class="form-control" style="height: 40px" id="Select1" name="theType">
					<option value=1>Hotel</option>
					<option value=2>Travel</option>
					<option value=3>Business Lunch</option>
					<option value=4>Training</option>
				</select>
			</div>
			<div class="form-group">
				<label for="exampleInputFile">Reciept</label> <input type="file"
					class="form-control-file" id="exampleInputFile"
					aria-describedby="fileHelp">
			</div>
			<div class="form-group">
				<input type="button" value="Submit" id="submitReimButton"
					class="btn btn-primary btn-md" />
					<input type="button" value="Cancel" id="cancelButton" class="btn"/>
			</div>

		</form>
		<div id="somediv"></div>
	</div>
	<script type="text/javascript" src="src/js/ers.js"></script>
</body>
</html>