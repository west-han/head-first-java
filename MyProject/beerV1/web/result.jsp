<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSP Page</title>
</head>
<body>
    <h1>Beer Recommendations JSP</h1>
    <br>

    <%
        List<String> styles = (List<String>) request.getAttribute("styles");
        for (String style : styles) {
            out.print("<br>try: " + style);
        }
    %>
</body>
</html>
