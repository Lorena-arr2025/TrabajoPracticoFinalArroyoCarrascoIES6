package edu.ar.easymover.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "conductores")
public class ConductorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConductor;

    private Boolean estadoConductor;
    private String nombre;
    private String apellido;
    private String licencia;
    private String email;

    // ==========================
    //     RELACIÓN ONE TO ONE
    // ==========================
    @OneToOne(mappedBy = "conductor")
    private Vehicle vehicle;

    // Constructor vacío
    public ConductorModel() {}

    // Constructor completo
    public ConductorModel(Integer idConductor, Boolean estadoConductor, String nombre,
                          String apellido, String licencia, String email) {

        this.idConductor = idConductor;
        this.estadoConductor = estadoConductor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.licencia = licencia;
        this.email = email;
    }

    // GETTERS
    public Integer getIdConductor() { return idConductor; }
    public Boolean getEstadoConductor() { return estadoConductor; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getLicencia() { return licencia; }
    public String getEmail() { return email; }
    public Vehicle getVehicle() { return vehicle; }

    // SETTERS
    public void setIdConductor(Integer idConductor) { this.idConductor = idConductor; }
    public void setEstadoConductor(Boolean estadoConductor) { this.estadoConductor = estadoConductor; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setLicencia(String licencia) { this.licencia = licencia; }
    public void setEmail(String email) { this.email = email; }
    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }
}
