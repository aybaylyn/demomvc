<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>idea 构建mvc</title>
</head>
<body>

hi,${user.userName},longin success! <br/>
<a href="/users/logout" >退出</a><br/>


<shiro:hasRole name="超级管理员">
    <span id="topmenu">超级管理员</span>
</shiro:hasRole>


</body>