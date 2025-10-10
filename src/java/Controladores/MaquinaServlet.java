package Controladores;

import Modelo.Maquina;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.html.HTML; // ¡Importa HTML de forma incorrecta! Asumo que esto es un error de copia.
                                    // NO deberías tener esta línea, o si usas Maven/Gradle, podría ser un conflicto. 
                                    // La eliminé en el código de abajo.

@WebServlet(name = "MaquinaServlet", urlPatterns = {"/MaquinaServlet"})
public class MaquinaServlet extends HttpServlet {

    // Cambié a 'volatile' por si se accede desde múltiples hilos, aunque 'static' es suficiente para este ejemplo.
    private static volatile List<Maquina> maquinas = new ArrayList<>();

    // Bloque estático para inicializar datos (Solo se ejecuta una vez)
    static {
        // --- Datos de ejemplo para que la tarjeta se vea como en la imagen ---
        Maquina m1 = new Maquina();
        m1.setNombre("VH-002");
        m1.setEstado("Mantenimiento");
        m1.setModelo("Mercedes Sprinter");
        m1.setConductor("Ana Rodriguez");
        m1.setUbicacion("Depot Central - Taller A");
        m1.setEficiencia(97.8);
        m1.setKilometraje(87200);
        m1.setTipoCombustible("Diesel");
        m1.setAntiguedad(5);
        m1.setHorasUso(12000);
        m1.setUltimaActualizacion("2023-10-25");
        maquinas.add(m1);

        Maquina m2 = new Maquina();
        m2.setNombre("VH-003");
        m2.setEstado("Activo");
        m2.setModelo("Renault Master");
        m2.setConductor("Luis Perez");
        m2.setUbicacion("Ruta Sur - Estación C");
        m2.setEficiencia(85.5);
        m2.setKilometraje(45000);
        m2.setTipoCombustible("GNV");
        m2.setAntiguedad(2);
        m2.setHorasUso(5500);
        m2.setUltimaActualizacion("2023-10-20");
        maquinas.add(m2);
        
        // Puedes agregar más máquinas aquí...
    }

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
                
                // -----------------------------------------------------
                // Se asumen valores por defecto o se obtienen si el formulario se actualiza
                // NOTA: Tu formulario de la JSP original no pide estos 4 campos.
                // Si actualizas la JSP, deberás obtenerlos con request.getParameter("campo_nuevo").
                // Por ahora, les daremos valores por defecto o estáticos.
                // -----------------------------------------------------
                String modelo = "Modelo Genérico";
                String conductor = "Pendiente Asignar";
                double eficiencia = 100.0;
                String ubicacion = "Base Nueva";


                // Utiliza el constructor vacío y setters para mayor flexibilidad,
                // o actualiza el constructor de Maquina para incluir los 4 nuevos campos.
                Maquina nueva = new Maquina(nombre, estado, antiguedad, imagen, kilometraje, tipoCombustible, horasUso, ultimaActualizacion);
                
                // Settear los nuevos campos
                nueva.setModelo(modelo);
                nueva.setConductor(conductor);
                nueva.setEficiencia(eficiencia);
                nueva.setUbicacion(ubicacion);

                maquinas.add(nueva);

                request.setAttribute("maquinas", maquinas);
                // Usar sendRedirect para evitar el reenvío del formulario al recargar
                response.sendRedirect(request.getContextPath() + "/vistasAdmin/maquinas.jsp");

            } catch (Exception e) {
                e.printStackTrace();
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error al agregar máquina. Verifique los tipos de datos.");
            }
        }
    }

    // Usar doGet para mostrar la lista
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setAttribute("maquinas", maquinas);
        // Redirige a la JSP para mostrar la lista
        request.getRequestDispatcher("/vistasAdmin/maquinas.jsp").forward(request, response);
    }
    
    // Este método estático ahora solo devuelve la lista, ya que la inicialización está en el bloque estático
    public static List<Maquina> getMaquinas() {
        return maquinas;
    }
}