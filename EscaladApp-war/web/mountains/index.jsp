<%@page import="persistence.MountainDB"%>
<%@page import="model.Mountain"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<Mountain> mountains = MountainDB.getAllMountains();
    int mountainsCount = mountains.size();
    int limit;
    try {
     limit = Integer.parseInt(request.getParameter("page")) - 1;
    } catch(Exception e) {
        limit = 0;
    }
    for (int i = 0; i < limit * MountainDB.PAGE_SIZE; i++) {
        mountains.remove(0);
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EscaladApp - Picos</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.2/css/bulma.min.css"/>
        <link rel="stylesheet" href="/EscaladApp-war/public/css/mystyle.css"/>
    </head>
    <body>
        <jsp:include page="/WEB-INF/partials/navbar.jsp"></jsp:include>

            <section class="hero is-success is-fullheight bg-img">
                <div class="hero-body">
                    <div class="container">
                        <h1 class="title is-3">Picos</h1>
                        <div class="columns is-centered">
                            <div class="column">
                            <%
                                int size = mountains.size();
                                for (int i = 0; i < size; i++) {
                            %>
                            <div class="card">
                                <div class="card-image">
                                    <figure class="image is-4by3">
                                        <img src="<%= mountains.get(0).getImage()%>" alt="<%= mountains.get(0).getName()%>">
                                    </figure>
                                </div>

                                <header class="card-header">
                                    <a class="card-header-title" href="/EscaladApp-war/FrontServlet?command=mountain.ShowMountainCommand&id=<%= mountains.get(0).getId()%>">
                                        <%= mountains.get(0).getName()%>
                                    </a>
                                </header>

                                <div class="card-content">
                                    <div class="content">
                                        <% if(mountains.get(0).getDescription().length() > 150) { %>
                                        <%= mountains.get(0).getDescription().replaceAll("\\<[^>]*>", "").substring(0, 150) + "..."%>
                                        <% } %>
                                    </div>
                                </div>
                            </div>
                            <%
                                    mountains.remove(0);
                                    if (i == 2) {
                                        break;
                                    }
                                }
                            %>
                        </div>

                        <div class="column">
                            <%
                                size = mountains.size();
                                for (int i = 0; i < size; i++) {
                            %>
                            <div class="card">
                                <div class="card-image">
                                    <figure class="image is-4by3">
                                        <img src="<%= mountains.get(0).getImage()%>" alt="<%= mountains.get(0).getName()%>">
                                    </figure>
                                </div>

                                <header class="card-header">
                                    <a class="card-header-title" href="/EscaladApp-war/FrontServlet?command=mountain.ShowMountainCommand&id=<%= mountains.get(0).getId()%>">
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
                                    mountains.remove(0);
                                    if (i == 2) {
                                        break;
                                    }
                                }
                            %>
                        </div>

                        <div class="column">
                            <%
                                size = mountains.size();
                                for (int i = 0; i < size; i++) {
                            %>
                            <div class="card">
                                <div class="card-image">
                                    <figure class="image is-4by3">
                                        <img src="<%= mountains.get(0).getImage()%>" alt="<%= mountains.get(0).getName()%>">
                                    </figure>
                                </div>

                                <header class="card-header">
                                    <a class="card-header-title" href="/EscaladApp-war/FrontServlet?command=mountain.ShowMountainCommand&id=<%= mountains.get(0).getId()%>">
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
                                    mountains.remove(0);
                                    if (i == 2) {
                                        break;
                                    }
                                }
                            %>
                        </div>
                    </div>

                    <% if (mountainsCount > MountainDB.PAGE_SIZE) { %>
                    <nav class="pagination is-centered" role="navigation" aria-label="pagination">
                        <ul class="pagination-list">
                            <% for (int i = 0; i < Math.ceil((double) mountainsCount / MountainDB.PAGE_SIZE); i++) {%>
                            <li>
                                <a class="pagination-link" aria-label="Goto page 1" href="/EscaladApp-war/mountains/index.jsp?page=<%= i + 1%>">
                                    <%= i + 1%>
                                </a>
                            </li>
                            <% } %>
                        </ul>
                    </nav>
                    <% }%>
                </div>
        </section>

        <jsp:include page="/WEB-INF/partials/footer.jsp"></jsp:include>
    </body>
</html>