<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import = "java.util.*,com.springboot.demo.model.*" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test Automation Reports</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link href="//cdnjs.cloudflare.com/ajax/libs/select2/4.0.0/css/select2.min.css" rel="stylesheet"/>
<script src="//cdnjs.cloudflare.com/ajax/libs/select2/4.0.0/js/select2.min.js"></script>
<link rel="stylesheet" href="css/welcome.css"></link>
<script src="js/welcome.js"> </script>
</head>

<body>

<div id="header123">

 <h2> <center>Automation Reports</center></h2>

</div>
<div id="contentbody">
	<div id="menubar">
      <select class="js-example-responsive" style="width: 18%" id="distinctdates">
      </select>
       <select class="js-example-responsive" style="width: 20%" id="platform">
      	<option>API</option>
      	<option>Web</option>
      	<option>Mobile</option>
      </select>
	</div>
   <div id="contentbody">
    <ul class="nav nav-tabs">
     <li class="active"><a data-toggle="tab" href="#testplan">Test Plan</a></li>
     <li><a data-toggle="tab" href="#testcase">TestCase</a></li>
     <li><a data-toggle="tab" href="#testcasedtls">TestCase Details</a></li>
    </ul>
    <div class="tab-content">
      <div id="testplan" class="tab-pane fade in active">
       <table class="table table-bordered">
            </table>
      </div>
      <div id="testcase" class="tab-pane fade">
       <h2> Testcase tab called</h2>
      </div>
      <div id="testcasedtls" class="tab-pane fade">
      <h2> Testcase details tab called</h2>
            </div>

    </div>
<div>

</body>
</html>