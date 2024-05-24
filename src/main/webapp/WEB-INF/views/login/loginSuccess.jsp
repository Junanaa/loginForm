<%--
  Created by IntelliJ IDEA.
  User: jun
  Date: 5/24/24
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title><spring:message code="login.title"/></title>
</head>
<body>
<p><spring:message code="login.done"/> </p>
<p>
<a href="<c:url value='/main' />">[<spring:message code="go.main" />]</a>

    </p>
    </body>
    </html>