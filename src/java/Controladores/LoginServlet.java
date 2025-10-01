package Controladores;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        if ("admin".equals(usuario) && "123".equals(password)) {
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rol", "admin");
            response.sendRedirect("vistasAdmin/inicio.jsp");
        } else if ("empleado".equals(usuario) && "123".equals(password)) {
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rol", "empleado");
            response.sendRedirect("vistasEmpleado/empleadoMaquinas.jsp");
        } else {
            request.setAttribute("mensajeError", "Usuario o contraseña incorrectos");
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        }
    }
}
