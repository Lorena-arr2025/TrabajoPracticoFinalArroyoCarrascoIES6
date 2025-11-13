package edu.ar.easymover.model;

public class Vehicle {
    // Atributos
    private String patente;
    private String marca;
    private String color;
    private String fechaFabricacion;
    private String provinciaOrigen;
    

    // Constructores---
    
    // Constructor por defecto
    public Vehicle() {
    
} 
    // constructores parametrizados
public Vehicle(String patente, String marca, String color, String fechaFabricacion, String provinciaOrigen) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.fechaFabricacion = fechaFabricacion;
        this.provinciaOrigen = provinciaOrigen;

    }    

    // constructor parcial
public Vehicle(String patente, String marca) {
        this.patente = patente;
        this.marca = marca;

    }
    // getters and setters
    public String getPatente () {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;

    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;

    }
    public String getColor () {
        return color;

    }
    public void setColor(String color) {
        this.color = color;

    }
    public String getFechaFabricacion() {
        return fechaFabricacion;

    }
    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getProvinciaOrigen() {
        return provinciaOrigen;
    }

    public void setProvinciaOrigen(String provinciaOrigen) {
        this.provinciaOrigen = provinciaOrigen;
    }

} 
    
