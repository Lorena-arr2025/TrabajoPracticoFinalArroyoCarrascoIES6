package edu.ar.easymover.model;

public class Vehicle {
    // Atributos
    private Integer idVehicle;
    private String patente;
    private String modelo;
    private String color;
    private Boolean estadoVehicle;
    private String tipoVehicle;



    // Constructores---
    
    // Constructor por defecto
    public Vehicle() {
    
} 
    // constructores parametrizados


    public Vehicle(Integer idVehicle, String patente, String modelo, String color, boolean estadoVehicle,
        String tipoVehicle) {
    this.idVehicle = idVehicle;
    this.patente = patente;
    this.modelo = modelo;
    this.color = color;
    this.estadoVehicle = estadoVehicle;
    this.tipoVehicle = tipoVehicle;
}


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


    public boolean isEstadoVehicle() {
        return estadoVehicle;
    }


    public String getTipoVehicle() {
        return tipoVehicle;
    }
    // getters and setters


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


    public void setEstadoVehicle(boolean estadoVehicle) {
        this.estadoVehicle = estadoVehicle;
    }


    public void setTipoVehicle(String tipoVehicle) {
        this.tipoVehicle = tipoVehicle;
    }
}  