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
                        <h1 class="title is-3">Picos</h1>
                        <div class="columns is-centered">
                            <div class="column">
                            <% for (int i = 0; i < mountains.size(); i++) {%>
                            <div class="card">
                                <div class="card-image">
                                    <figure class="image is-4by3">
                                        <img src="<%= mountains.get(0).getImage()%>" alt="<%= mountains.get(0).getName()%>">
                                    </figure>
                                </div>

                                <header class="card-header">
                                    <a class="card-header-title" href="/FrontServlet?command=mountain.ShowMountainCommand&id=<%= mountains.get(0).getId()%>">
                                        <%= mountains.get(0).getName()%>
                                    </a>
                                </header>

                                <div class="card-content">
                                    <div class="content">
                                        <%= mountains.get(0).getDescription().replaceAll("\\<[^>]*>", "").substring(0, 150) + "..."%>
                                    </div>
                                </div>
                            </div>
                            <% mountains.remove(0); %>
                            <% if (i == 2) {
                                    break;
                                } %>
                            <% }%>
                        </div>

                        <div class="column">
                            <% for (int i = 0; i < mountains.size(); i++) {%>
                            <div class="card">
                                <div class="card-image">
                                    <figure class="image is-4by3">
                                        <img src="<%= mountains.get(0).getImage()%>" alt="<%= mountains.get(0).getName()%>">
                                    </figure>
                                </div>

                                <header class="card-header">
                                    <a class="card-header-title" href="/FrontServlet?command=mountain.ShowMountainCommand&id=<%= mountains.get(0).getId()%>">
                                        <%= mountains.get(0).getName()%>
                                    </a>
                                </header>

                                <div class="card-content">
                                    <div class="content">
                                        <%= mountains.get(0).getDescription().replaceAll("\\<[^>]*>", "").substring(0, 150) + "..."%>
                                    </div>
                                </div>
                            </div>
                            <% mountains.remove(0); %>
                            <% if (i == 2) {
                                    break;
                                } %>
                            <% }%>
                        </div>

                        <div class="column">
                            <% for (int i = 0; i < mountains.size(); i++) {%>
                            <div class="card">
                                <div class="card-image">
                                    <figure class="image is-4by3">
                                        <img src="<%= mountains.get(0).getImage()%>" alt="<%= mountains.get(0).getName()%>">
                                    </figure>
                                </div>

                                <header class="card-header">
                                    <a class="card-header-title" href="/FrontServlet?command=mountain.ShowMountainCommand&id=<%= mountains.get(0).getId()%>">
                                        <%= mountains.get(0).getName()%>
                                    </a>
                                </header>

                                <div class="card-content">
                                    <div class="content">
                                        <%= mountains.get(0).getDescription().replaceAll("\\<[^>]*>", "").substring(0, 150) + "..."%>
                                    </div>
                                </div>
                            </div>
                            <%
                                    System.out.println("Actual: "+mountains.size());
                                    mountains.remove(0);
                                }%>
                        </div>
                    </div>
                </div>
        </section>

        <jsp:include page="/WEB-INF/partials/footer.jsp"></jsp:include>
    </body>
</html>