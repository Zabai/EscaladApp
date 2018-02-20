<%@page import="persistence.MountainDB"%>
<%@page import="model.Mountain"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% ArrayList<Mountain> mountains = MountainDB.getAllMountains(); %>
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

                    </div>
                </div>
            </section>

        <jsp:include page="/WEB-INF/partials/footer.jsp"></jsp:include>
    </body>
</html>