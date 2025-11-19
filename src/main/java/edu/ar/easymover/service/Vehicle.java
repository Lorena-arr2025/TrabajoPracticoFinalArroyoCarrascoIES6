package edu.ar.easymover.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "vehiculos")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVehicle;

    private String patente;
    private String modelo;
    private String color;
    private Boolean estadoVehicle;
    private String tipoVehiculo;

    // ==========================
    //         RELACIONES
    // ==========================

    // ✔ Relación 1:1 con ConductorModel
    @OneToOne
    @JoinColumn(name = "idConductor")
    private ConductorModel conductor;

    // ✔ Relación N:1 con UsuarioModel (propietario del vehículo)
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private UsuarioModel usuario;

    // ✔ Relación 1:N con Viaje
    @OneToMany(mappedBy = "vehicle")
    private List<Viaje> viajes;

    // ==========================
    //       CONSTRUCTORES
    // ==========================

    public Vehicle() {}

    public Vehicle(Integer idVehicle, String patente, String modelo, String color,
                   Boolean estadoVehicle, String tipoVehiculo) {
        this.idVehicle = idVehicle;
        this.patente = patente;
        this.modelo = modelo;
        this.color = color;
        this.estadoVehicle = estadoVehicle;
        this.tipoVehiculo = tipoVehiculo;
    }

    // ==========================
    //          GETTERS
    // ==========================

    public Integer getIdVehicle() { return idVehicle; }
    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }
    public String getColor() { return color; }
    public Boolean getEstadoVehicle() { return estadoVehicle; }
    public String getTipoVehiculo() { return tipoVehiculo; }
    public ConductorModel getConductor() { return conductor; }
    public UsuarioModel getUsuario() { return usuario; }
    public List<Viaje> getViajes() { return viajes; }

    // ==========================
    //          SETTERS
    // ==========================

    public void setIdVehicle(Integer idVehicle) { this.idVehicle = idVehicle; }
    public void setPatente(String patente) { this.patente = patente; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setColor(String color) { this.color = color; }
    public void setEstadoVehicle(Boolean estadoVehicle) { this.estadoVehicle = estadoVehicle; }
    public void setTipoVehiculo(String tipoVehiculo) { this.tipoVehiculo = tipoVehiculo; }
    public void setConductor(ConductorModel conductor) { this.conductor = conductor; }
    public void setUsuario(UsuarioModel usuario) { this.usuario = usuario; }
    public void setViajes(List<Viaje> viajes) { this.viajes = viajes; }
}
