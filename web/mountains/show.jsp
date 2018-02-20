<%@page import="persistence.MountainDB"%>
<%@page import="model.Mountain"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Mountain mountain = MountainDB.getById(Integer.parseInt(request.getParameter("id"))); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EscaladApp - <%= mountain.getName() %></title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.2/css/bulma.min.css"/>
    </head>
    <body>
        <%= mountain.getDescription() %>
    </body>
</html>