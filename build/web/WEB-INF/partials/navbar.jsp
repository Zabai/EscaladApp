<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% User user = (User) session.getAttribute("user"); %>

<nav class="navbar is-dark" role="navigation" aria-label="main navigation">
    <div class="container">
        <div class="navbar-brand">
            <a class="navbar-item" href="/">
                <img src="/public/images/logo.png" alt="" width="40" height="40">
                EscaladApp
            </a>
        </div>

        <div class="navbar-start">
            <a class="navbar-item" href="/mountains/index.jsp">Picos</a>

            <% if (user != null && user.isAdministrator()) { %>
            <a class="navbar-item" href="/mountains/new.jsp">Añadir pico</a>
            <a class="navbar-item" href="/mountains/show.jsp">Ver pico</a>
            <% } %>
        </div>

        <div class="navbar-end">
            <%
                if (user == null) {
            %>
            <a class="navbar-item" href="/account/login.jsp">
                Entrar
            </a>
            <span class="navbar-item">
                <a class="button is-info" href="/account/sign-up.jsp">
                    Registrarse
                </a>
            </span>
            <% } else {%>
            <a class="navbar-item" href="/account/profile.jsp">
                <%= user.getUsername()%>
            </a>

            <span class="navbar-item">
                <form action="/FrontServlet">
                    <input hidden="true" name="command" value="LogOutCommand">
                    <button class="button is-danger">Salir</button>
                </form>
            </span>
            <% }%>
        </div>
    </div>
</nav>