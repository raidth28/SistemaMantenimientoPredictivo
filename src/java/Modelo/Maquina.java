/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author kristhor
 */
public class Maquina {
    private String nombre;
    private String estado;
    private int antiguedad;
    private String imagen;
    private int kilometraje;          
    private String tipoCombustible;  
    private int horasUso;
    private String ultimaActualizacion;

    // ------------------------------------------
    // Campos Nuevos para el Diseño de la Tarjeta
    // ------------------------------------------
    private String modelo;
    private String conductor;
    private double eficiencia; // Usaremos un Double/float para el porcentaje (ej: 97.8)
    private String ubicacion;
    
    // NOTA: Usaremos el tipoCombustible existente para el valor del combustible (ej: 78) si lo mapeas a un número.
    // Si no, necesitarías un campo 'nivelCombustible'. Por ahora, ajustaré el JSP para usar un valor de ejemplo.


    public Maquina() {}

    // Constructor con los campos originales (Añade los nuevos si lo usas)
    public Maquina(String nombre, String estado, int antiguedad, String imagen, int kilometraje, String tipoCombustible, int horasUso, String ultimaActualizacion) {
        this.nombre = nombre;
        this.estado = estado;
        this.antiguedad = antiguedad;
        this.imagen = imagen;
        this.kilometraje = kilometraje;
        this.tipoCombustible = tipoCombustible;
        this.horasUso = horasUso;
        this.ultimaActualizacion = ultimaActualizacion;
        // Los nuevos campos se inicializarán a sus valores por defecto (null, 0.0)
    }
    
    // *** Opcional: Constructor Completo ***
    public Maquina(String nombre, String estado, int antiguedad, String imagen, int kilometraje, String tipoCombustible, int horasUso, String ultimaActualizacion, String modelo, String conductor, double eficiencia, String ubicacion) {
        this.nombre = nombre;
        this.estado = estado;
        this.antiguedad = antiguedad;
        this.imagen = imagen;
        this.kilometraje = kilometraje;
        this.tipoCombustible = tipoCombustible;
        this.horasUso = horasUso;
        this.ultimaActualizacion = ultimaActualizacion;
        
        this.modelo = modelo;
        this.conductor = conductor;
        this.eficiencia = eficiencia;
        this.ubicacion = ubicacion;
    }


    // ------------------------------------------
    // Getters y Setters ORIGINALES
    // ------------------------------------------

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public int getAntiguedad() { return antiguedad; }
    public void setAntiguedad(int antiguedad) { this.antiguedad = antiguedad; }

    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }

    public int getKilometraje() { return kilometraje; }
    public void setKilometraje(int kilometraje) { this.kilometraje = kilometraje; }

    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }

    public int getHorasUso() { return horasUso; }
    public void setHorasUso(int horasUso) { this.horasUso = horasUso; }

    public String getUltimaActualizacion() { return ultimaActualizacion; }
    public void setUltimaActualizacion(String ultimaActualizacion) { this.ultimaActualizacion = ultimaActualizacion; }
    
    // ------------------------------------------
    // Getters y Setters NUEVOS (Resuelven el error de compilación)
    // ------------------------------------------

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }
    
    public double getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(double eficiencia) {
        this.eficiencia = eficiencia;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}