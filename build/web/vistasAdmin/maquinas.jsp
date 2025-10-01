
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="Modelo.Maquina" %>
<%@ page import="Controladores.MaquinaServlet" %>
<%@ include file="layout.jsp" %>
<%
    request.setAttribute("titulo", "Listado de Máquinas");
        

    List<Maquina> maquinas = (List<Maquina>) request.getAttribute("maquinas");

    
    if (maquinas == null) {
        maquinas = MaquinaServlet.getMaquinas();
    }
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Máquinas</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/barraNavegacion.css">
</head>

<body>
    <div class="container my-4">
        
        <div class="mb-4">
            <h1 class="h3 d-inline">Máquinas</h1>
            
            <button type="button" class="btn btn-sm btn-primary ms-2" data-bs-toggle="modal" data-bs-target="#modalAgregarMaquina">
                + Agregar Máquina
            </button>
        </div>
        
        <div class="modal fade" id="modalAgregarMaquina" tabindex="-1" aria-labelledby="modalAgregarMaquinaLabel" aria-hidden="true">
          <div class="modal-dialog modal-lg">
            <div class="modal-content">
              <form action="<%= request.getContextPath() %>/MaquinaServlet" method="post">
                <div class="modal-header">
                  <h5 class="modal-title" id="modalAgregarMaquinaLabel">Agregar Nueva Máquina</h5>
                  <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Cerrar"></button>
                </div>

                <div class="modal-body">
                  <div class="mb-3">
                    <label for="nombre" class="form-label">Nombre de la máquina</label>
                    <input type="text" class="form-control" id="nombre" name="nombre" required>
                  </div>

                  <div class="mb-3">
                    <label for="estado" class="form-label">Estado</label>
                    <select class="form-select" id="estado" name="estado" required>
                      <option value="Activo">Activo</option>
                      <option value="Mantenimiento">Mantenimiento</option>
                      <option value="Inactivo">Inactivo</option>
                    </select>
                  </div>

                  <div class="mb-3">
                    <label for="antiguedad" class="form-label">Antigüedad (%)</label>
                    <input type="number" class="form-control" id="antiguedad" name="antiguedad" min="0" max="100" required>
                  </div>

                  <div class="mb-3">
                    <label for="imagen" class="form-label">URL de Imagen</label>
                    <input type="text" class="form-control" id="imagen" name="imagen">
                  </div>
                    
                  <div class="mb-3"> 
                    <label for="kilometraje" class="form-label">Kilometraje (km)</label>
                    <input type="number" class="form-control" id="kilometraje" name="kilometraje" required>
                  </div>

                  <div class="mb-3">   
                    <label for="tipoCombustible" class="form-label">Tipo de Combustible</label>
                    <select class="form-select" id="tipoCombustible" name="tipoCombustible" required>
                      <option value="GNV">Gas Natural Vehicular (GNV)</option>
                      <option value="Diesel">Diésel</option>
                    </select>
                  </div>
                    
                  <div class="mb-3">
                    <label for="horasUso" class="form-label">Horas de uso</label>
                    <input type="number" class="form-control" id="horasUso" name="horasUso" min="0" required>
                  </div>

                  <div class="mb-3">
                    <label for="ultimaActualizacion" class="form-label">Última actualización</label>
                    <input type="date" class="form-control" id="ultimaActualizacion" name="ultimaActualizacion" required>
                  </div> 
                    
                </div>

                <div class="modal-footer">
                  <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                  <button type="submit" class="btn btn-primary" name="accion" value="agregar">Guardar</button>
                </div>
              </form>
            </div>
          </div>
        </div>

            <div class="row row-cols-1 row-cols-md-3 g-4">
                <%
                    if (maquinas != null && !maquinas.isEmpty()) {
                        for (Maquina m : maquinas) {
                            
                            String img = (m.getImagen() != null && !m.getImagen().trim().isEmpty())
                                         ? m.getImagen()
                                         : request.getContextPath() + "/img/placeholder.png";
                %>
                <div class="col">
                    <div class="card shadow-sm">
                        <img src="<%= img %>" class="card-img-top" alt="<%= m.getNombre() %>">
                        <div class="card-body text-center">
                            <h5 class="card-title"><%= m.getNombre() %></h5>
                            <p>
                                <span class="badge <%= "Activo".equals(m.getEstado()) ? "bg-success" :
                                                       "Mantenimiento".equals(m.getEstado()) ? "bg-warning" : "bg-secondary" %>">
                                    <%= m.getEstado() %>
                                </span>
                            </p>
                            <a href="#" class="btn btn-primary btn-sm">Detalles</a>
                            <div class="mt-3">
                                <%
                                    int anios = m.getAntiguedad();
                                    int porcentaje = (int) ((anios * 100.0) / 25);
                                %>
                                <small class="text-muted">Antigüedad: <%= anios %> años (<%= porcentaje %>%)</small>
                                <div class="progress">
                                    <div class="progress-bar" role="progressbar"
                                         style="width: <%= porcentaje %>%;" 
                                         aria-valuenow="<%= porcentaje %>" aria-valuemin="0" aria-valuemax="100">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <%
                        } 
                    } else {
                %>
                <div class="col-12">
                    <p class="text-muted">No hay máquinas registradas aún.</p>
                </div>
                <% } %>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>