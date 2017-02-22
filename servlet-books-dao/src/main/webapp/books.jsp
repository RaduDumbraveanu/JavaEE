<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>servlet-hello project</title>
</head>
<body>
    <table>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.title}</td>
                <td>${book.editionNumber}</td>
                <td>${book.url}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>