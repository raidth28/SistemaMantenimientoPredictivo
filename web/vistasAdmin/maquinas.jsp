
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
    <link rel="stylesheet" href="css/custom-cards.css">
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

        <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 row-cols-lg-4 g-4">
                <%
                    if (maquinas != null && !maquinas.isEmpty()) {
                        for (Maquina m : maquinas) {
                            
                            // Determinar imagen (usando un ícono de vehículo por defecto si no hay URL)
                            String vehicleIconClass = (m.getImagen() != null && !m.getImagen().trim().isEmpty())
                                                            ? "" // No es un ícono, es una imagen
                                                            : "bi bi-truck vehicle-icon-placeholder"; // Bootstrap Icon (se necesita importar)
                            
                            String img = (vehicleIconClass.isEmpty())
                                            ? m.getImagen()
                                            : request.getContextPath() + "/img/placeholder.png"; // Usar el placeholder si no es un ícono

                            // Lógica de color de estado
                            String estadoColorClass = "status-badge-secondary"; // Clase por defecto
                            String estadoText = "Mantenimiento";
                            if ("Activo".equals(m.getEstado())) {
                                estadoColorClass = "status-badge-success";
                                estadoText = "Activo";
                            } else if ("Inactivo".equals(m.getEstado())) {
                                estadoColorClass = "status-badge-danger";
                                estadoText = "Inactivo";
                            }
                            
                            // Asumiendo que Maquina tiene los métodos: getNombre(), getUbicacion(), getModelo(), getConductor(), getEficiencia(), getCombustible(), getKilometraje()
                            // Nota: En tu JSP original usas getAntiguedad() como un porcentaje. Aquí usaré un valor fijo de ejemplo (97.8) para la Eficiencia.
                            double eficiencia = 97.8; // Valor de ejemplo, ajusta a tu modelo
                            int combustible = 78; // Valor de ejemplo, ajusta a tu modelo
                            String ubicacion = "Depot Central - Taller A"; // Valor de ejemplo, ajusta a tu modelo
                %>
                <div class="col">
                    <div class="custom-machine-card shadow-sm p-3">
                        
                        <div class="d-flex justify-content-between align-items-start mb-3">
                            <div class="d-flex align-items-center">
                                <div class="vehicle-icon-wrapper">
                                    <i class="bi bi-truck vehicle-icon-placeholder"></i>
                                </div>
                                <div>
                                    <h5 class="machine-id mb-0"><%= m.getNombre() %></h5>
                                    <small class="text-muted"><%= m.getModelo() %> (Distribución B)</small>
                                </div>
                            </div>
                            <span class="status-badge <%= estadoColorClass %>"><%= m.getEstado() %></span>
                        </div>

                        <div class="mb-3 machine-detail-group">
                            <p class="mb-1"><i class="bi bi-geo-alt-fill me-2"></i><%= ubicacion %></p>
                            <p class="mb-0"><i class="bi bi-person-fill me-2"></i>Conductor: <strong><%= m.getConductor() %></strong></p>
                        </div>
                        
                        <div class="metrics-grid">
                            <div class="metric-item">
                                <i class="bi bi-graph-up metric-icon-green"></i>
                                <h4 class="metric-value text-success mb-0"><%= String.format("%.1f", eficiencia) %>%</h4>
                                <small class="metric-label text-muted">Eficiencia</small>
                            </div>

                            <div class="metric-item">
                                <i class="bi bi-fuel-pump-fill metric-icon-blue"></i>
                                <h4 class="metric-value text-info mb-0"><%= combustible %></h4>
                                <small class="metric-label text-muted">Combustible</small>
                            </div>

                            <div class="metric-item">
                                <i class="bi bi-clock metric-icon-secondary"></i>
                                <h4 class="metric-value text-secondary mb-0"><%= String.format("%,d", m.getKilometraje()) %> km</h4>
                                <small class="metric-label text-muted">km</small>
                            </div>
                        </div>

                        <div class="mt-3 text-center">
                            <a href="#" class="btn btn-sm btn-outline-primary w-100">Ver Detalles</a>
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
        
        
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>