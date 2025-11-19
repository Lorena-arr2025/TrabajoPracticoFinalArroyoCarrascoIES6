package edu.ar.easymover.model;

import jakarta.persistence.*;

@Entity
@Table(name = "viajes")
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idViaje;

    private String origen;
    private String destino;
    private Double costo;
    private String fecha;

    // ==========================
    //        RELACIONES
    // ==========================

    // ✔ Relación N:1 con Vehicle (un viaje utiliza un vehículo)
    @ManyToOne
    @JoinColumn(name = "idVehicle")
    private Vehicle vehicle;

    // ✔ Relación N:1 con UsuarioModel (cliente que hizo el viaje)
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private UsuarioModel usuario;

    // ==========================
    //       CONSTRUCTORES
    // ==========================

    public Viaje() {}

    public Viaje(String origen, String destino, Double costo, String fecha,
                 Vehicle vehicle, UsuarioModel usuario) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fecha = fecha;
        this.vehicle = vehicle;
        this.usuario = usuario;
    }

    // ==========================
    //          GETTERS
    // ==========================

    public Integer getIdViaje() { return idViaje; }
    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public Double getCosto() { return costo; }
    public String getFecha() { return fecha; }
    public Vehicle getVehicle() { return vehicle; }
    public UsuarioModel getUsuario() { return usuario; }

    // ==========================
    //          SETTERS
    // ==========================

    public void setIdViaje(Integer idViaje) { this.idViaje = idViaje; }
    public void setOrigen(String origen) { this.origen = origen; }
    public void setDestino(String destino) { this.destino = destino; }
    public void setCosto(Double costo) { this.costo = costo; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }
    public void setUsuario(UsuarioModel usuario) { this.usuario = usuario; }
}
