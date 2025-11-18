package edu.ar.easymover.model;

import jakarta.persistence.*;

@Entity
public class Vehicle {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVehicle;

    private String patente;
    private String modelo;
    private String color;
    private Boolean estadoVehicle;  
    private String tipoVehiculo;    // X, Luxe, Premium según consigna

    // Constructor por defecto
    public Vehicle() {
    }

    // Constructor parametrizado
    public Vehicle(Integer idVehicle, String patente, String modelo, String color, 
                   Boolean estadoVehicle, String tipoVehiculo) {

        this.idVehicle = idVehicle;
        this.patente = patente;
        this.modelo = modelo;
        this.color = color;
        this.estadoVehicle = estadoVehicle;
        this.tipoVehiculo = tipoVehiculo;
    }

    // =======================
    //      GETTERS
    // =======================

    public Integer getIdVehicle() {
        return idVehicle;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public Boolean getEstadoVehicle() {
        return estadoVehicle;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    // =======================
    //      SETTERS
    // =======================

    public void setIdVehicle(Integer idVehicle) {
        this.idVehicle = idVehicle;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEstadoVehicle(Boolean estadoVehicle) {
        this.estadoVehicle = estadoVehicle;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
}
