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
        <link rel="stylesheet" href="/public/css/mystyle.css"/>
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
                                <% if (user != null && !user.isAdministrator()) { %>
                                <% if (UserHelper.userHasFavouriteMountain(user, mountain.getId())) { %>
                                <a class="button is-success">Save changess</a>
                                <% } %>
                                <a class="button is-info">Save and continue</a>
                                <a class="button is-danger">Cancel</a>
                                <% } else if (user != null) { %>
                                <a class="button is-info" href="/mountains/edit.jsp?id=<%= mountain.getId() %>">Editar</a>
                                <a class="button is-danger" href="/FrontServlet?command=mountain.RemoveMountain&id=<%= mountain.getId() %>">Borrar</a>
                                <% }%>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <script>
            var user = '${user}';
            var mountain = '${mountain}';
        </script>

        <jsp:include page="/WEB-INF/partials/footer.jsp"></jsp:include>
    </body>
</html>