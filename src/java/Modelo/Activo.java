/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author kristhor
 */
public class Activo {
    private int idActivo;
    private String placa;
    private String codigoInterno;
    private String nombre;
    private int idTipoActivo;
    private String marca;
    private String modelo;
    private int anio;
    private int capacidadPasajeros;
    private double kilometrajeActual;
    private String estado;
    private String fechaRegistro;

    public Activo(int idActivo, String placa, String codigoInterno, String nombre, int idTipoActivo, String marca, String modelo, int anio, int capacidadPasajeros, double kilometrajeActual, String estado, String fechaRegistro) {
        this.idActivo = idActivo;
        this.placa = placa;
        this.codigoInterno = codigoInterno;
        this.nombre = nombre;
        this.idTipoActivo = idTipoActivo;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.capacidadPasajeros = capacidadPasajeros;
        this.kilometrajeActual = kilometrajeActual;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(int idActivo) {
        this.idActivo = idActivo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdTipoActivo() {
        return idTipoActivo;
    }

    public void setIdTipoActivo(int idTipoActivo) {
        this.idTipoActivo = idTipoActivo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public double getKilometrajeActual() {
        return kilometrajeActual;
    }

    public void setKilometrajeActual(double kilometrajeActual) {
        this.kilometrajeActual = kilometrajeActual;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
