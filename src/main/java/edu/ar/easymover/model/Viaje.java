package edu.ar.easymover.model;

import jakarta.persistence.*;

@Entity
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idViaje;

    private String origen;
    private String destino;
    private String fecha;
    private Double costo;
    private Boolean estadoViaje;
    private String tipoViaje; // corta – media – larga

    // RELACIÓN N:1 con Vehículo
    @ManyToOne
    @JoinColumn(name = "idVehicle")
    private Vehicle vehicle;

    // Constructor vacío
    public Viaje() {}

    // Getters y setters
    public Integer getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(Integer idViaje) {
        this.idViaje = idViaje;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Boolean getEstadoViaje() {
        return estadoViaje;
    }

    public void setEstadoViaje(Boolean estadoViaje) {
        this.estadoViaje = estadoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
