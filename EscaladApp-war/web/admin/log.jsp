<%@page import="logger.Log"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EscaladApp - Log</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.2/css/bulma.min.css"/>
        <link rel="stylesheet" href="/EscaladApp-war/public/css/mystyle.css"/>
    </head>
    <body>
        <jsp:include page="/WEB-INF/partials/navbar.jsp"></jsp:include>

        <section class="hero is-success is-fullheight bg-img">
            <div class="hero-body">
                <div class="container">
                    <div class="columns is-centered">
                        <div class="column is-4 has-text-white box log">
                            <h3 class="subtitle is-3">Log:</h3>
                            <hr>
                            <%= Log.readLoag() %>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <jsp:include page="/WEB-INF/partials/footer.jsp"></jsp:include>
    </body>
</html>
