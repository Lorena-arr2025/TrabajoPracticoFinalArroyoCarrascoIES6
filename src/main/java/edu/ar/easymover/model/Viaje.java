package edu.ar.easymover.model;

public class Viaje {
    private Integer idViaje;
    private String origen;
    private String destino;
    private String fecha;
    private Double costo;
    private Boolean estadoViaje;
    private String tipoViaje;

    // Getters y Setters
    public Integer getId() {
        return idViaje;
    }

    public void setId(Integer idViaje) {
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
    public void setEstadoViaje(boolean estadoViaje) {
        this.estadoViaje = estadoViaje;
    }

    public boolean isEstadoViaje() {
        return estadoViaje;
    }
    public String getTipoViaje() {
        return tipoViaje;
    }
      public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

}
