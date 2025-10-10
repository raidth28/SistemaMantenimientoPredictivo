/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Date; 
/**
 *
 * @author Raidth
 */
public class Mantenimientos {
    private int idMantenimiento;
    private int idActivo;
    private int idUsuario;
    private int idTipoMantenimiento;
    private String descripcion;
    private String fecha;
    private double kilometraje;
    private double costo;
    private String estado;
    private Date proximoMantenimiento;

    public Mantenimientos(int idMantenimiento, int idActivo, int idUsuario, int idTipoMantenimiento, String descripcion, String fecha, double kilometraje, double costo, String estado, Date proximoMantenimiento) {
        this.idMantenimiento = idMantenimiento;
        this.idActivo = idActivo;
        this.idUsuario = idUsuario;
        this.idTipoMantenimiento = idTipoMantenimiento;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.kilometraje = kilometraje;
        this.costo = costo;
        this.estado = estado;
        this.proximoMantenimiento = proximoMantenimiento;
    }

    public int getIdMantenimiento() {
        return idMantenimiento;
    }

    public void setIdMantenimiento(int idMantenimiento) {
        this.idMantenimiento = idMantenimiento;
    }

    public int getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(int idActivo) {
        this.idActivo = idActivo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdTipoMantenimiento() {
        return idTipoMantenimiento;
    }

    public void setIdTipoMantenimiento(int idTipoMantenimiento) {
        this.idTipoMantenimiento = idTipoMantenimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getProximoMantenimiento() {
        return proximoMantenimiento;
    }

    public void setProximoMantenimiento(Date proximoMantenimiento) {
        this.proximoMantenimiento = proximoMantenimiento;
    }

}
