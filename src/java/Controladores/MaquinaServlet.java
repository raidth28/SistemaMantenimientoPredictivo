package Controladores;

import Modelo.Maquina;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "MaquinaServlet", urlPatterns = {"/MaquinaServlet"})
public class MaquinaServlet extends HttpServlet {

    private static List<Maquina> maquinas = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        String accion = request.getParameter("accion");

        if ("agregar".equals(accion)) {
            try {
                String nombre = request.getParameter("nombre");
                String estado = request.getParameter("estado");
                int antiguedad = Integer.parseInt(request.getParameter("antiguedad"));
                String imagen = request.getParameter("imagen");
                int kilometraje = Integer.parseInt(request.getParameter("kilometraje")); 
                String tipoCombustible = request.getParameter("tipoCombustible");        
                int horasUso = Integer.parseInt(request.getParameter("horasUso")); 
                String ultimaActualizacion = request.getParameter("ultimaActualizacion");

                Maquina nueva = new Maquina(nombre, estado, antiguedad, imagen, kilometraje, tipoCombustible, horasUso, ultimaActualizacion);

                maquinas.add(nueva);

                request.setAttribute("maquinas", maquinas);
                response.sendRedirect(request.getContextPath() + "/vistasAdmin/maquinas.jsp");

            } catch (Exception e) {
                e.printStackTrace();
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error al agregar máquina");
            }
        }
    }

    public static List<Maquina> getMaquinas() {
        return maquinas;
    }
}
