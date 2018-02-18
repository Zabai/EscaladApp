<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EscaladApp - Nuevo Pico</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.2/css/bulma.min.css"/>
        <link rel="stylesheet" href="/public/css/mystyle.css"/>
        <script src="/public/js/textboxio/textboxio.js"></script>
    </head>
    <body>
        <jsp:include page="/WEB-INF/partials/navbar.jsp"></jsp:include>

            <section class="hero is-success is-fullheight bg-img">
                <div class="hero-body">
                    <div class="container">
                        <div class="columns is-vcentered is-centered">
                            <div class="column is-6">
                                <h1 class="title has-text-white">
                                    Añadir un pico
                                </h1>

                                <div class="box">
                                    <form action="/FrontServlet" method="post" accept-charset="UTF-8">
                                        <label class="label">*Nombre del pico</label>
                                        <p class="control">
                                            <input class="input" placeholder="Teide" autofocus="true" name="name">
                                        </p>
                                        <label class="label">Localización</label>
                                        <p class="control">
                                            <input class="input" placeholder="Tenerife" name="location">
                                        </p>
                                        <label class="label">Altitud (msnm)</label>
                                        <p class="control">
                                            <input class="input" placeholder="3718" name="altitude">
                                        </p>
                                        <label class="label">Imagen</label>
                                        <p class="control">
                                            <input class="input" placeholder="URL" name="image">
                                        </p>
                                        <hr>

                                        <label class="label">Descripción</label>
                                        <p class="control">
                                            <textarea id="textarea" class="textarea is-primary" type="text" placeholder="El Teide tiene..." rows="12" name="description"></textarea>
                                        </p>
                                        <hr>
                                        
                                        <input hidden="true" name="command" value="CreateMountainCommand">
                                        <div class="field is-grouped is-grouped-centered">
                                            <p class="control is-centered">
                                                <button class="button is-link">Añadir montaña</button>
                                                <a class="button is-default" href="/">Cancelar</a>
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
