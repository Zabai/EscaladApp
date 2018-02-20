<<<<<<< HEAD
<%@page import="persistence.MountainDB"%>
<%@page import="model.Mountain"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% ArrayList<Mountain> mountains = MountainDB.getAllMountains(); %>
=======
<%@page contentType="text/html" pageEncoding="UTF-8"%>
>>>>>>> f572dea0ef774e33d0004f4409ad57910bfa205f
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EscaladApp - Picos</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.2/css/bulma.min.css"/>
        <link rel="stylesheet" href="/public/css/mystyle.css"/>
    </head>
    <body>
        <jsp:include page="/WEB-INF/partials/navbar.jsp"></jsp:include>

            <section class="hero is-success is-fullheight bg-img">
                <div class="hero-body">
                    <div class="container">
<<<<<<< HEAD
                        <div class="columns is-centered">
                            <div class="column">
                                
                            </div>
                            <div class="column">
                                <div class="notification is-primary">
                                    <p><%= mountains.size() %></p>
                                </div>
                            </div>
                            <div class="column">
                                
                            </div>
                        </div>

=======
                        <h1 class="title is-3">Picos</h1>
                        <div class="columns is-centered">
                            <div class="column">
                                <div class="card">
                                    <div class="card-image">
                                        <figure class="image is-4by3">
                                            <img src="https://bulma.io/images/placeholders/1280x960.png" alt="Placeholder image">
                                        </figure>
                                    </div>
                                    
                                    <header class="card-header">
                                        <a class="card-header-title" href="/mountains/">
                                            Nombre del pico
                                        </a>
                                    </header>
                                    
                                    <div class="card-content">
                                        <div class="content">
                                            Descripción
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="column">
                                <div class="notification is-primary">
                                </div>
                            </div>
                            <div class="column">
                                <div class="notification is-primary">
                                </div>
                            </div>
                        </div>
>>>>>>> f572dea0ef774e33d0004f4409ad57910bfa205f
                    </div>
                </div>
            </section>

        <jsp:include page="/WEB-INF/partials/footer.jsp"></jsp:include>
    </body>
<<<<<<< HEAD
</html>
=======
</html>
>>>>>>> f572dea0ef774e33d0004f4409ad57910bfa205f
