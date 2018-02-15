<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% if(session.getAttribute("user") == null) response.sendRedirect("/"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EscaladApp - Mi perfil</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.2/css/bulma.min.css"/>
    </head>
    <body>
        <jsp:include page="/WEB-INF/partials/navbar.jsp"></jsp:include>
        
        
        
        <jsp:include page="/WEB-INF/partials/footer.jsp"></jsp:include>
    </body>
</html>