<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<!DOCTYPE html>
<html>
<head>
    <title><spring:message code="member.register"/></title>
</head>
<body>
<h2>Step3 - <spring:message code="register.btn"/></h2>
<p>
    <spring:message code="register.done" arguments="${formData.name}"/>
    <%--    <strong>${registerRequest.name}님</strong>--%>
</p>
<%--s--%>
<a href="<c:url value='/main' />">[<spring:message code="go.main"/>]</a>
</body>
</html>