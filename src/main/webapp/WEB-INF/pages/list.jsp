<%--
  Created by IntelliJ IDEA.
  User: nick
  Date: 2019/5/30
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<%--引入jstl标签库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>查询所有用户</h2>

<c:forEach items="${list}" var="account">
    ${account.name}
</c:forEach>

</body>
</html>
