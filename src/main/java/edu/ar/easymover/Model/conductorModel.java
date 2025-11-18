package edu.ar.easymover.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "conductores")
public class ConductorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConductor;

    private Boolean estadoConductor; // activo / inactivo
    private String nombre;
    private String apellido;
    private String licencia;
    private String email;

    // Constructor vacío (obligatorio para JPA)
    public ConductorModel() {}

    // Constructor con parámetros (opcional pero útil)
    public ConductorModel(Integer idConductor, Boolean estadoConductor, String nombre,
                          String apellido, String licencia, String email) {
        this.idConductor = idConductor;
        this.estadoConductor = estadoConductor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.licencia = licencia;
        this.email = email;
    }

    // Getters
    public Integer getIdConductor() { return idConductor; }
    public Boolean getEstadoConductor() { return estadoConductor; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getLicencia() { return licencia; }
    public String getEmail() { return email; }

    // Setters
    public void setIdConductor(Integer idConductor) { this.idConductor = idConductor; }
    public void setEstadoConductor(Boolean estadoConductor) { this.estadoConductor = estadoConductor; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setLicencia(String licencia) { this.licencia = licencia; }
    public void setEmail(String email) { this.email = email; }
    
}