<%@page import="entities.Mountain"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Map.Entry"%>
<%@page import="stateful.Route.State"%>
<%@page import="java.util.Collections"%>
<%@page import="stateful.Route"%>
<%@page import="javax.naming.InitialContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Route route = InitialContext.doLookup("java:global/EscaladApp/EscaladApp-ejb/Route!stateful.Route");
    
    if (session.getAttribute("user") == null) {
        response.sendRedirect("/EscaladApp-war/");
    } else {
        route = (Route) session.getAttribute("route");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EscaladApp - Mi perfil</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.2/css/bulma.min.css"/>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.6/css/all.css">
        <link rel="stylesheet" href="/EscaladApp-war/public/css/mystyle.css"/>
    </head>
    <body>
        <jsp:include page="/WEB-INF/partials/navbar.jsp"></jsp:include>
        
        <section class="hero is-success is-fullheight bg-img">
                <div class="hero-body">
                    <div class="container">
                        <div class="box">
                            <h1 class="title is-1">Mi perfil</h1>

                            <hr>
                            <h1 class="subtitle is-3">
                                <i class="fas fa-tasks"></i>
                                Mi ruta
                            </h1>
                            <progress class="progress is-info" 
                                      value="<%= Collections.frequency(route.getMountains().values(), State.Visited) %>" 
                                      max="<%= route.getMountains().size() %>"></progress>
                        <table class="table is-fullwidth">
                            <thead>
                                <tr>
                                    <th></th>
                                    <th>Nombre</th>
                                    <th>Localización</th>
                                    <th>Altitud</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>

                            <tbody>
                                <% for (Map.Entry<Mountain, State> entry : route.getMountains().entrySet()) {%>
                                <tr>
                                    <td><img class="image is-96x96" src="<%= entry.getKey().getImage()%>"></td>
                                    <td><%= entry.getKey().getName() %></td>
                                    <td><%= entry.getKey().getLocation()%></td>
                                    <td><%= entry.getKey().getAltitude()%></td>
                                    <td>
                                        <p>BUTTONS</p>
                                    </td>
                                </tr>
                                <% }%>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </section>
        
        <jsp:include page="/WEB-INF/partials/footer.jsp"></jsp:include>
    </body>
</html>
