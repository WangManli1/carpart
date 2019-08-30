<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title></title>
</head>
<body>
<shiro:hasRole name="admin">
<button>添加员工</button>
</shiro:hasRole>

    <button>查询员工</button>

</body>
</html>
