<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>servlet-jsp</title>
    </head>
<body>
    <%
        String name = request.getParameter("name");
        if (name == null || "".equals(name.trim())) {
    %>
    <h1>Hello, World!</h1>
    <%
        } else {
    %>
    <h1>Hello, <% out.print(name); %>!</h1>
    <%
        }
    %>
</body>
</html>