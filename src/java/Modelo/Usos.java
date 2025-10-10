/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Raidth
 */
public class Usos {
    private int idUso;
    private int idActivo;
    private int idUsuario;
    private int idRuta;
    private String fecha;
    private double horasUso;
    private double kmRecorridos;
    private double combustibleConsumido;

    public Usos(int idUso, int idActivo, int idUsuario, int idRuta, String fecha, double horasUso, double kmRecorridos, double combustibleConsumido) {
        this.idUso = idUso;
        this.idActivo = idActivo;
        this.idUsuario = idUsuario;
        this.idRuta = idRuta;
        this.fecha = fecha;
        this.horasUso = horasUso;
        this.kmRecorridos = kmRecorridos;
        this.combustibleConsumido = combustibleConsumido;
    }

    public int getIdUso() {
        return idUso;
    }

    public void setIdUso(int idUso) {
        this.idUso = idUso;
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

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(double horasUso) {
        this.horasUso = horasUso;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public double getCombustibleConsumido() {
        return combustibleConsumido;
    }

    public void setCombustibleConsumido(double combustibleConsumido) {
        this.combustibleConsumido = combustibleConsumido;
    }
    
}
