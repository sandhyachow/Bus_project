<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="">
		Enter Type:
		<select name="walletType">
		<option value="PHONE_PAY">PHONE_PAY</option>
		<option value="GOOGLE_PAY">GOOGLE_PAY</option>
		<option value="PAYTM">PAYTM</option>
		<option value="CASH">CASH</option>
		</select><br/></br>
		Enter Amount :
		<input type="number" name ="walletAmount"/><br/><br/>
		Enter Id :
		<input type="text" name ="user_id"/><br/><br/>
		<input type="submit" value ="Insert"/><br/><br/>
	
</form>
<c:if test="${param.walletAmount!= null}">
	<jsp:useBean id="beanDriverDetailsDAO" class="com.infinite.Busbooking.DriverDetailsDAO" />
	<jsp:useBean id="beanUserWallet" class="com.infinite.Busbooking.UserWallet"/>
	<jsp:setProperty property="*" name="beanUserWallet" />
	<c:out value="${beanDriverDetailsDAO.addUserWallet(beanUserWallet)}"/>
</c:if>
</center>
</body>
</html>
