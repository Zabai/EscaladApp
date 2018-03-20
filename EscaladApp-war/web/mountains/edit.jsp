<%@page import="persistence.MountainDB"%>
<%@page import="model.Mountain"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Mountain mountain = MountainDB.getById(Integer.parseInt(request.getParameter("id"))); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EscaladApp - Editando <%= mountain.getName() %></title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.2/css/bulma.min.css"/>
        <link rel="stylesheet" href="/public/css/mystyle.css"/>
        <script src="/EscaladApp-war/public/js/textboxio/textboxio.js"></script>
    </head>
    <body>
        <jsp:include page="/WEB-INF/partials/navbar.jsp"></jsp:include>

            <section class="hero is-success is-fullheight bg-img">
                <div class="hero-body">
                    <div class="container">
                        <div class="columns is-vcentered is-centered">
                            <div class="column is-6">
                                <h1 class="title has-text-white">
                                    Editar <%= mountain.getName() %>
                                </h1>

                                <div class="box">
                                    <form action="/EscaladApp-war/FrontServlet" method="post" accept-charset="UTF-8">
                                        <label class="label">*Nombre del pico</label>
                                        <input hidden="true" name="id" value="<%= mountain.getId() %>">
                                        <p class="control">
                                            <input class="input" placeholder="Teide" autofocus="true" name="name" value="<%= mountain.getName() %>">
                                        </p>
                                        <label class="label">Localización</label>
                                        <p class="control">
                                            <input class="input" placeholder="Tenerife" name="location" value="<%= mountain.getLocation() %>">
                                        </p>
                                        <label class="label">Altitud (msnm)</label>
                                        <p class="control">
                                            <input class="input" placeholder="3718" name="altitude" value="<%= mountain.getAltitude() %>">
                                        </p>
                                        <label class="label">Imagen</label>
                                        <p class="control">
                                            <input class="input" placeholder="URL" name="image" value="<%= mountain.getImage() %>">
                                        </p>
                                        <hr>

                                        <label class="label">Descripción</label>
                                        <p class="control">
                                            <textarea id="textarea" class="textarea is-primary" type="text" placeholder="El Teide tiene..." rows="12" name="description"><%= mountain.getDescription() %></textarea>
                                        </p>
                                        <hr>
                                        
                                        <input hidden="true" name="command" value="mountain.EditMountainCommand">
                                        <div class="field is-grouped is-grouped-centered">
                                            <p class="control is-centered">
                                                <button class="button is-link">Editar pico</button>
                                                <a class="button is-default" href="/EscaladApp-war/mountains/index.jsp">Cancelar</a>
                                            </p>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <script type="text/javascript">
                var editor = textboxio.replace('#textarea');
            </script>

        <jsp:include page="/WEB-INF/partials/footer.jsp"></jsp:include>
    </body>
</html>