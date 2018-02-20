<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% if(session.getAttribute("user") != null) response.sendRedirect("/"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EscaladApp - Registro</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.2/css/bulma.min.css"/>
        <link rel="stylesheet" href="/public/css/mystyle.css"/>
    </head>
    <body>
        <jsp:include page="/WEB-INF/partials/navbar.jsp"></jsp:include>

            <section class="hero is-fullheight is-bold bg-img">
                <div class="hero-body">
                    <div class="container">
                        <div class="columns is-vcentered is-centered">
                            <div class="column is-4">
                                <h1 class="title has-text-white">
                                    Crear una cuenta
                                </h1>
                                <div class="box">
                                    <form action="/FrontServlet" method="post">
                                        <label class="label">Nombre de usuario</label>
                                        <p class="control">
                                            <input class="input" placeholder="Jefe Maestro" type="text" autofocus="true" name="username">
                                        </p>
                                        <label class="label">Correo electrónico</label>
                                        <p class="control">
                                            <input class="input" placeholder="master@chief.org" type="text" name="email">
                                        </p>
                                        <hr>

                                        <label class="label">Contraseña</label>
                                        <p class="control">
                                            <input class="input" placeholder="●●●●●●●" type="password" name="password">
                                        </p>
                                        <label class="label">Confirmar contraseña</label>
                                        <p class="control">
                                            <input class="input" placeholder="●●●●●●●" type="password" name="passwordRepeat">
                                        </p>
                                        <hr>
                                        
                                        <input hidden="true" name="command" value="account.SignUpCommand">
                                        <div class="field is-grouped is-grouped-centered">
                                            <p class="control is-centered">
                                                <button class="button is-link">Registrarse</button>
                                                <a class="button is-default" href="/">Cancelar</a>
                                            </p>
                                        </div>
                                    </form>
                                </div>
                                
                                <p class="has-text-centered">
                                    <span>¿Ya tienes cuenta?</span>
                                    <a class="has-text-info" href="/account/login.jsp">Identificate aquí</a>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

        <jsp:include page="/WEB-INF/partials/footer.jsp"></jsp:include>
    </body>
</html>