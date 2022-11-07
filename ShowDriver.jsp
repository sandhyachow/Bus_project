<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="AddDriver.jsp"/><br/><br/>
<jsp:useBean id="beanDao" class="com.infinite.Busbooking.DriverDetailsDAO"/>
<table border ="3" align ="center">
<tr>



<th>Driver_id</th>
<th>Driver_name</th>
<th>Driver_lic_no</th>
<th>Driver_contact_no</th>

</tr>
<c:forEach var="DriverDetails" items="${beanDao.ShowDriver() }">
<tr>
<td>$DdriverDetails.driver_id}</td>
<td>${DriverDetails.driver_name}</td>
<td>${DriverDetails.driver_lic_no}</td>
<td>${DriverDetails.drivercontct-no}</td>
</tr>
</c:forEach>
</table>
</body>
</html>