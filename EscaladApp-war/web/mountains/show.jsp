<%@page import="helpers.UserHelper"%>
<%@page import="model.Mountain"%>
<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% User user = (User) session.getAttribute("user"); %>
<% Mountain mountain = (Mountain) request.getAttribute("mountain");%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EscaladApp - <%= mountain.getName()%></title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.2/css/bulma.min.css"/>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.6/css/all.css">
        <link rel="stylesheet" href="/EscaladApp-war/public/css/mystyle.css"/>
        <script src="/EscaladApp-war/public/js/action.js"></script>
    </head>
    <body>
        <jsp:include page="/WEB-INF/partials/navbar.jsp"></jsp:include>

            <section class="hero is-success is-fullheight bg-img">
                <div class="hero-body">
                    <div class="container box">
                        <div class="columns is-centered">
                            <div class="column is-4">
                                <figure class="image is-4by3">
                                    <img src="<%= mountain.getImage()%>" alt="<%= mountain.getName()%>">
                            </figure>
                        </div>

                        <div class="column is-6 is-offset-1">
                            <h1 class="title is-2">
                                <%= mountain.getName()%>
                            </h1>
                            <h2 class="subtitle is-4">
                                Altura: <%= mountain.getAltitude()%> - Localización: <%= mountain.getLocation()%>
                            </h2>
                            <span><%= mountain.getDescription()%></span>
                            <br>

                            <div class="buttons is-centered">
                                <% if (user != null && !user.isAdministrator()) {%>
                                <a id="climbed" class="button is-success is-rounded is-inverted" href="/FrontServlet?command=user.ClimbedCommand&id=<%= mountain.getId() %>">
                                    Escalado
                                </a>
                                <a id="favourite" class="button is-danger is-rounded is-inverted" href="/FrontServlet?command=user.FavouriteCommand&id=<%= mountain.getId()%>">
                                    <i class="far fa-heart"></i>
                                </a>
                                <% } else if (user != null) {%>
                                <a class="button is-info" href="/EscaladApp-war/mountains/edit.jsp?id=<%= mountain.getId()%>">Editar</a>
                                <a class="button is-danger" href="/FrontServlet?command=mountain.RemoveMountain&id=<%= mountain.getId()%>">Borrar</a>
                                <% }%>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <script>
            checkClimbed(JSON.parse('${user}'), <%= mountain.getId() %>);
            checkFavourite(JSON.parse('${user}'), <%= mountain.getId() %>);
        </script>

        <jsp:include page="/WEB-INF/partials/footer.jsp"></jsp:include>
    </body>
</html>