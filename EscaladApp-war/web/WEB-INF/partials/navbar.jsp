<%@page import="entities.User"%>
<%@page import="analytics.Statistics"%>
<%@page import="logger.Log"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    Log.logJsp(request.getRequestURI());
    
    Statistics.incrementVisits();
    Statistics.incrementPageVisits(request.getRequestURI());
%>
<% User user = (User) session.getAttribute("user"); %>

<nav class="navbar is-dark" role="navigation" aria-label="main navigation">
    <div class="container">
        <div class="navbar-brand">
            <a class="navbar-item" href="/EscaladApp-war/">
                <img src="/EscaladApp-war/public/images/logo.png" alt="" width="40" height="40">
                EscaladApp
            </a>
        </div>

        <div class="navbar-start">
            <a class="navbar-item" href="/EscaladApp-war/mountains/index.jsp?page=1">Picos</a>

            <% if (user != null && user.isAdministrator()) { %>
            <a class="navbar-item" href="/EscaladApp-war/mountains/new.jsp">Añadir pico</a>
            <a class="navbar-item" href="/EscaladApp-war/mountains/show.jsp">Ver pico</a>
            <a class="navbar-item" href="/EscaladApp-war/admin/statistics.jsp">Estadísticas</a>
            <a class="navbar-item" href="/EscaladApp-war/admin/log.jsp">Log</a>
            <% } %>
        </div>

        <div class="navbar-end">
            <%
                if (user == null) {
            %>
            <a class="navbar-item" href="/EscaladApp-war/account/login.jsp">
                Entrar
            </a>
            <span class="navbar-item">
                <a class="button is-info" href="/EscaladApp-war/account/sign-up.jsp">
                    Registrarse
                </a>
            </span>
            <% } else {%>
            <a class="navbar-item" href="/EscaladApp-war/account/profile.jsp">
                <%= user.getUsername()%>
            </a>

            <span class="navbar-item">
                <form action="/EscaladApp-war/FrontServlet">
                    <input hidden="true" name="command" value="account.LogOutCommand">
                    <button class="button is-danger">Salir</button>
                </form>
            </span>
            <% }%>
        </div>
    </div>
</nav>