/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Raidth
 */
public class Alertas {
    private int idAlerta;
    private int idActivo;
    private int idTipoAlerta;
    private String mensaje;
    private String estado;
    private int idUsuarioResponsable;
    private String fechaCreacion;

      public Alertas(int idAlerta, int idActivo, int idTipoAlerta, String mensaje, String estado, int idUsuarioResponsable, String fechaCreacion) {
        this.idAlerta = idAlerta;
        this.idActivo = idActivo;
        this.idTipoAlerta = idTipoAlerta;
        this.mensaje = mensaje;
        this.estado = estado;
        this.idUsuarioResponsable = idUsuarioResponsable;
        this.fechaCreacion = fechaCreacion;
    }
    
    public int getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(int idAlerta) {
        this.idAlerta = idAlerta;
    }

    public int getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(int idActivo) {
        this.idActivo = idActivo;
    }

    public int getIdTipoAlerta() {
        return idTipoAlerta;
    }

    public void setIdTipoAlerta(int idTipoAlerta) {
        this.idTipoAlerta = idTipoAlerta;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdUsuarioResponsable() {
        return idUsuarioResponsable;
    }

    public void setIdUsuarioResponsable(int idUsuarioResponsable) {
        this.idUsuarioResponsable = idUsuarioResponsable;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}


