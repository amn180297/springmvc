<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<f:form action="updateemp2" method="POST" modelAttribute="emp">

<!-- Model Attribute should be same  -->



<!-- Path Names are same as Employee Data Member  -->
id<f:input path="id" value="${empu.id}" readonly="true"/>
Enter Name<f:input path="name"/>
<%-- <f:errors path="name"></f:errors> --%>
Enter Salary<f:input path="salary"/>
<input type ="submit" value="Update"/>



</f:form>

</body>
</html>