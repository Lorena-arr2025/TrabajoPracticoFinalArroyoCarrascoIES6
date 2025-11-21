package edu.ar.easymover.model;

import jakarta.persistence.*;
import java.util.List;
import edu.ar.easymover.model.Viaje;

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
    // RELACIONES
    // ==========================

    //@OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
    //private List<Viaje> viajes;

    // ==========================
    // CONSTRUCTORES
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
    // GETTERS
    // ==========================

    public Integer getIdVehicle() { return idVehicle; }
    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }
    public String getColor() { return color; }
    public Boolean getEstadoVehicle() { return estadoVehicle; }
    public String getTipoVehiculo() { return tipoVehiculo; }
    //public List<Viaje> getViajes() { return viajes; }

    // ==========================
    // SETTERS
    // ==========================

    public void setIdVehicle(Integer idVehicle) { this.idVehicle = idVehicle; }
    public void setPatente(String patente) { this.patente = patente; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setColor(String color) { this.color = color; }
    public void setEstadoVehicle(Boolean estadoVehicle) { this.estadoVehicle = estadoVehicle; }
    public void setTipoVehiculo(String tipoVehiculo) { this.tipoVehiculo = tipoVehiculo; }
    //public void setViajes(List<Viaje> viajes) { this.viajes = viajes; }
}
