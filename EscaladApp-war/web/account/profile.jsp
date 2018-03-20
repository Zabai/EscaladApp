<%@page import="helpers.UserHelper"%>
<%@page import="persistence.MountainDB"%>
<%@page import="model.Mountain"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (session.getAttribute("user") == null) {
        response.sendRedirect("/EscaladApp-war/");
    }
    User user = (User) session.getAttribute("user");
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
                                Montañas escaladas
                            </h1>
                            <progress class="progress is-info" value="<%= user.getClimbed().size()%>" max="<%= MountainDB.getAllMountains().size() %>"></progress>
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
                                <% for (Mountain mountain : user.getClimbed()) {%>
                                <tr>
                                    <td><img class="image is-96x96" src="<%= mountain.getImage()%>"></td>
                                    <td><%= mountain.getName()%></td>
                                    <td><%= mountain.getLocation()%></td>
                                    <td><%= mountain.getAltitude()%></td>
                                    <td>
                                        <a class="button is-danger" href="/FrontServlet?command=user.ClimbedCommand&id=<%= mountain.getId() %>">Eliminar</a>
                                    </td>
                                </tr>
                                <% }%>
                            </tbody>
                        </table>

                        <hr>
                        <h1 class="subtitle is-3">
                            <i class="fas fa-heart"></i>
                            Montañas favoritas
                        </h1>
                        <table class="table is-fullwidth ">
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
                                <% for (Mountain mountain : user.getFavourites()) {%>
                                <tr>
                                    <td><img class="image is-96x96" src="<%= mountain.getImage()%>"></td>
                                    <td><%= mountain.getName()%></td>
                                    <td><%= mountain.getLocation()%></td>
                                    <td><%= mountain.getAltitude()%></td>
                                    <td>
                                        <a class="button is-danger" href="/FrontServlet?command=user.FavouriteCommand&id=<%= mountain.getId() %>">Eliminar</a>
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