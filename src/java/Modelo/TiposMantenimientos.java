/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Raidth
 */
public class TiposMantenimientos {
      private int idTipoMantenimiento;
    private String nombreTipo;
    private String categoria;

    public TiposMantenimientos(int idTipoMantenimiento, String nombreTipo, String categoria) {
        this.idTipoMantenimiento = idTipoMantenimiento;
        this.nombreTipo = nombreTipo;
        this.categoria = categoria;
    }

    public int getIdTipoMantenimiento() {
        return idTipoMantenimiento;
    }

    public void setIdTipoMantenimiento(int idTipoMantenimiento) {
        this.idTipoMantenimiento = idTipoMantenimiento;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
