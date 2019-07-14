<%--
  Created by IntelliJ IDEA.
  User: nick
  Date: 2019/5/30
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="account/test">测试spring</a>
<a href="account/testMybatisSave">mybatis.save</a><br>

添加用户:
<form action="account/testMybatisSave" method="post">
    用户:<input type="text" name="name" value="lingwu"><br>
    金额:<input type="text" name="money" value="1000"><br>
    <input type="submit" value="保存">
</form>

</body>
</html>
