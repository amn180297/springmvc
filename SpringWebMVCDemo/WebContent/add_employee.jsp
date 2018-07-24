<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">

<f:form action="addemployee" method="POST" modelAttribute="emp">

<!-- Model Attribute should be same  -->



<!-- Path Names are same as Employee Data Member  -->
Enter ID<f:input path="id"/>
<%-- <f:errors path="id"></f:errors>
Enter Name<f:input path="name"/>
<f:errors path="name"></f:errors>
Enter Salary<f:input path="salary"/>
<input type ="submit" value="Add"/>
 --%>
 Enter Name<f:input path="name"/>
Enter Salary<f:input path="salary"/>
<input type ="submit" value="Add"/>
</f:form>



</body>
</html>