<%@page import="java.util.Map"%>
<%@page import="analytics.Statistics"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EscaladApp - Estadísticas</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.2/css/bulma.min.css"/>
        <link rel="stylesheet" href="/EscaladApp-war/public/css/mystyle.css"/>
    </head>
    <body>
        <jsp:include page="/WEB-INF/partials/navbar.jsp"></jsp:include>

        <section class="hero is-success is-fullheight bg-img">
            <div class="hero-body">
                <div class="container">
                    <div class="notification is-link">
                        <h1 class="subtitle is-3">Estadísticas generales</h1>
                        <p>Visitas: <%= Statistics.getVisits()%></p>
                        <p>Nº de logins: <%= Statistics.getLogins()%></p>
                        
                        <br>
                        <h1 class="subtitle is-3">Actividad en páginas</h1>
                        <table class="table is-bordered is-striped is-fullwidth">
                            <thead>
                                <tr>
                                    <th>Página</th>
                                    <th>Visitas</th>
                                </tr>
                            </thead>
                            <tfoot>
                                <tr>
                                    <th>Página</th>
                                    <th>Visitas</th>
                                </tr>
                            </tfoot>
                            <tbody>
                                <% for(Map.Entry<String, Integer> entry : Statistics.getPagesVisits().entrySet()) { %>
                                <tr>
                                    <td><%= entry.getKey() %></td>
                                    <td><%= entry.getValue() %></td>
                                </tr>
                                <% } %>
                            </tbody>
                        </table>
                            
                        <h1 class="subtitle is-3">Actividad en componentes</h1>
                        <table class="table is-bordered is-striped is-fullwidth">
                            <thead>
                                <tr>
                                    <th>Componente</th>
                                    <th>Llamadas</th>
                                </tr>
                            </thead>
                            <tfoot>
                                <tr>
                                    <th>Componente</th>
                                    <th>Llamadas</th>
                                </tr>
                            </tfoot>
                            <tbody>
                                <% for(Map.Entry<String, Integer> entry : Statistics.getComponentsCalls().entrySet()) { %>
                                <tr>
                                    <td><%= entry.getKey() %></td>
                                    <td><%= entry.getValue() %></td>
                                </tr>
                                <% } %>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </section>

        <jsp:include page="/WEB-INF/partials/footer.jsp"></jsp:include>
    </body>
</html>
