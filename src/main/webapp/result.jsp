<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Result</title>
    <style>
        table {
            text-align: center;
        }
    </style>
</head>
<body>
<%
    ResultSet set = (ResultSet) request.getSession().getAttribute("set");
    try {
        out.println("<table border=1 width=50% height=50% >");
        out.println("<tr><th>Flat id</th><th>Region</th><th>Address</th>" +
                "<th>Area</th><th>Number of rooms</th><th>Price</th></tr>");
        while (set.next()) {
            int id = set.getInt("flat_id");
            String region = set.getString("region");
            String address = set.getString("address");
            int area = set.getInt("area");
            int rooms = set.getInt("rooms_amount");
            double price = set.getDouble("price");
            out.println("<tr><td>" + id + "</td><td>" + region + "</td>" +
                    "<td>" + address + "</td><td>" + area + "</td><td>" + rooms +
                    "</td><td> " + price + "</td></tr>");
        }
        out.println("</table>");
        out.println("</html></body>");
    } catch (SQLException e) {
        e.printStackTrace();
    }
%>
</body>
</html>