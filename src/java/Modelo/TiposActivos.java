/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Raidth
 */
public class TiposActivos {
    private int idTipoActivo;
    private String nombreTipo;
 
    public TiposActivos(int idTipoActivo, String nombreTipo) {
        this.idTipoActivo = idTipoActivo;
        this.nombreTipo = nombreTipo;
    }

    public int getIdTipoActivo() {
        return idTipoActivo;
    }

    public void setIdTipoActivo(int idTipoActivo) {
        this.idTipoActivo = idTipoActivo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
    
}
