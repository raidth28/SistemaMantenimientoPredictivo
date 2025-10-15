/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Raidth
 */
public class TipoAlertas {
    private int idTipoAlerta;
    private String nombreTipo;
    private String prioridad;

    public TipoAlertas(int idTipoAlerta, String nombreTipo, String prioridad) {
        this.idTipoAlerta = idTipoAlerta;
        this.nombreTipo = nombreTipo;
        this.prioridad = prioridad;
    }

    public int getIdTipoAlerta() {
        return idTipoAlerta;
    }

    public void setIdTipoAlerta(int idTipoAlerta) {
        this.idTipoAlerta = idTipoAlerta;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
}
