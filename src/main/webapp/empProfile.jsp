<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="frags/navbar.jsp"%>
<%@ include file="frags/header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
</head>
<body>
	<div class="container container1" style="padding-top: 60px;">
  <h1 class="page-header">Edit Profile</h1>
  <div class="row">
    
    <!-- edit form column -->
    <div class="col-md-8 col-sm-6 col-xs-12 personal-info">
      <form class="form-horizontal" role="form">
        <div class="form-group">
          <label class="col-md-3 control-label">First name:</label>
          <div class="col-md-8">
            <input class="form-control" value="Jane" type="text">
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label">Last name:</label>
          <div class="col-md-8">
            <input class="form-control" value="Bishop" type="text">
          </div>
        </div>
        
        <div class="form-group">
          <label class="col-md-3 control-label">Email:</label>
          <div class="col-md-8">
            <input class="form-control" value="janesemail@gmail.com" type="text">
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label">Username:</label>
          <div class="col-md-8">
            <input class="form-control" value="janeuser" type="text">
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label">Password:</label>
          <div class="col-md-8">
            <input class="form-control" value="11111122333" type="password">
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label">Confirm password:</label>
          <div class="col-md-8">
            <input class="form-control" value="11111122333" type="password">
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label"></label>
          <div class="col-md-8">
            <input class="btn btn-primary" value="Save Changes" type="button">
            <span></span>
            <input class="btn btn-default" value="Cancel" type="reset">
          </div>
        </div>
      </form>
    </div>
  </div>
</div>
</body>
</html>