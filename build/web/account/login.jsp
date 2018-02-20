<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% if (session.getAttribute("user") != null) {
        response.sendRedirect("/");
    } %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EscaladApp - Entrar</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.2/css/bulma.min.css"/>
        <link rel="stylesheet" href="/public/css/mystyle.css"/>
    </head>
    <body>
        <jsp:include page="/WEB-INF/partials/navbar.jsp"></jsp:include>

            <section class="hero is-fullheight is-bold bg-img">
                <div class="hero-body">
                    <div class="container">
                        <div class="columns is-centered">
                            <div class="column is-4">
                                <h1 class="title has-text-white">
                                    Identificarse
                                </h1>
                                <div class="box">

                                <% if (request.getAttribute("error") != null) { %>
                                <p class="has-text-danger">${error}</p>
                                <% }%>

                                <form action="/FrontServlet" method="post">
                                    <label class="label">Nombre de usuario</label>
                                    <p class="control">
                                        <input class="input" placeholder="Jefe Maestro" type="text" autofocus="true" name="username">
                                    </p>

                                    <label class="label">Contraseña</label>
                                    <p class="control">
                                        <input class="input" placeholder="●●●●●●●" type="password" name="password">
                                    </p>
                                    <hr>

                                    <input hidden="true" name="command" value="LoginCommand">
                                    <div class="field is-grouped is-grouped-centered">
                                        <p class="control is-centered">
                                            <button class="button is-link">Entrar</button>
                                            <a class="button is-default" href="/">Cancelar</a>
                                        </p>
                                    </div>
                                </form>
                            </div>
                            <p class="has-text-centered">
                                <span>¿Aún no tienes cuenta?</span>
                                <a class="has-text-info" href="/account/sign-up.jsp">Registrate aquí</a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <jsp:include page="/WEB-INF/partials/footer.jsp"></jsp:include>
    </body>
</html>