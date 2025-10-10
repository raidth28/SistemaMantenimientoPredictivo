<%-- 
    Document   : seguridad
    Created on : 30 sept 2025, 20:32:36
    Author     : kristhor
--%>

<%@page import="jakarta.servlet.http.HttpSession"%>
<%
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);

    HttpSession sesion = request.getSession(false);
    String contextPath = request.getContextPath();
    String requestURI = request.getRequestURI();

    if (sesion == null || sesion.getAttribute("rol") == null) {
        response.sendRedirect(contextPath + "/index.jsp"); // No ha iniciado sesión
        return;
    }

    String rol = (String) sesion.getAttribute("rol");

    boolean accedeAdmin = requestURI.contains("/vistasAdmin/");
    boolean accedeEmpleado = requestURI.contains("/vistasEmpleado/");

    if ("admin".equals(rol) && accedeEmpleado) {
        response.sendRedirect(contextPath + "/vistasAdmin/admin.jsp");
        return;
    }

    if ("empleado".equals(rol) && accedeAdmin) {
        response.sendRedirect(contextPath + "/vistasEmpleado/empleadoMaquinas.jsp");
        return;
    }
%>
