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
<style>
#header {
  width: 100%;
  height: 70px;
  background-color: #8bd8bd;

}
#leftnav {

  width: 30%;
  height: 630px;
  background-color: #ffe4e1;
  float: left;

}
#rightnav {

  width: 100%;
  height: 630px;
  background-color: #cfeef7;

}

.table {
max-width:100%;
width: 70%;
}
#footer {

  width: 100%;
  height: 30px;
  background-color: yellow;

}
</style>
<script type="text/javascript">

  function loadData(){
          var environment = $('#buildversion').val();
          console.log("build version"+environment);
          if(environment && environment!=null && environment!=""){
              $.ajax({url: "/TestReports/testcaseresults", success: function(result){
                       for (var i = 0; i < result.length; i++) {
                       console.log(result[i].testcaseid);
                             $(".thead-dark").append("<tr><th scope=col>planid</th><th scope=col>username</th><th scope=col>buildversion</th><th scope=col>classname</th><th scope=col>methodname</th><th scope=col>result</th><th scope=col>exception</th><th scope=col>executiontime</th><th scope=col>message</th> <th scope=col>failure_log</th></tr>");
                             $("#tablebody").append("<tr><td>"+result[i].planid+"</td><td>"+result[i].username+"</td><td>"+result[i].buildversion+"</td><td>"+result[i].classname+"</td><td>"+result[i].methodname+" min</td> <td>"+result[i].result+"</td><td>"+result[i].exception+"</td><td>"+result[i].executiontime+"</td><td>"+result[i].message+"</td><td>"+result[i].failure_log+"</td></tr>");
                       }

               }});
          }

      }



</script>
</head>

<body>
<div id="main">
<div id="header">
        <div class="col-sm-2"> <img alt="" src="https://www.castlighthealth.com/wp-content/themes/bb/assets/images/logo-alt.svg" /></div>
        <div class="col-sm-8"><h1> <center>Automation Reports</center></h1></div>
        <div class="col-sm-2"></div>
</div>

<div id="contentbody">
    <div id="leftnav"> left content</div>
    <div id="rightnav">
   <select class="js-example-responsive" style="width: 20%" id="buildversion">
     </select2>
   </select>
       <table class="table">
         <thead class="thead-dark">
         </thead>

         <tbody id="tablebody">
         </tbody>

       </table>

    </div>

</div>

<div id="footer">
footer
</div>
</div>
</body>
</html>