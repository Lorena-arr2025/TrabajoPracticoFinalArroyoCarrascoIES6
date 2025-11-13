package edu.ar.easymover.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "conductores")
public class conductorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String dni;
    private String licencia;
    private double ingresoTotal;

    // Constructor vacío
    public conductorModel() {}

    // Constructor con parámetros
    public conductorModel(Integer id, String nombre, String dni, String licencia, double ingresoTotal) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.licencia = licencia;
        this.ingresoTotal = ingresoTotal;
    }

    // Getters
    public Integer getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public String getLicencia() { return licencia; }
    public double getIngresoTotal() { return ingresoTotal; }

    // Setters
    public void setId(Integer id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDni(String dni) { this.dni = dni; }
    public void setLicencia(String licencia) { this.licencia = licencia; }
    public void setIngresoTotal(double ingresoTotal) { this.ingresoTotal = ingresoTotal; }
}

