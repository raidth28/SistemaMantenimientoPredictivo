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

    public Maquina() {}

    public Maquina(String nombre, String estado, int antiguedad, String imagen, int kilometraje, String tipoCombustible, int horasUso, String ultimaActualizacion) {
        this.nombre = nombre;
        this.estado = estado;
        this.antiguedad = antiguedad;
        this.imagen = imagen;
        this.kilometraje = kilometraje;
        this.tipoCombustible = tipoCombustible;
        this.horasUso = horasUso;
        this.ultimaActualizacion = ultimaActualizacion;
    }

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

    public int getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(int horasUso) {
        this.horasUso = horasUso;
    }

    public String getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    public void setUltimaActualizacion(String ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }
    
    
}