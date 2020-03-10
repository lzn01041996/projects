<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 李小宁
  Date: 2020/2/26
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!--scope作用域是当前界面-->
    <c:set var="title" value="这个是c标签的作用域"/>
    <title>hello</title>
</head>
<body>
<h1>${title}</h1>
<c:forEach items="${names}" var="name" >
    <h1>name</h1>
</c:forEach>
hello java
${name}
<input type="button" value="加载数据" id="btn">
</body>
</html>
