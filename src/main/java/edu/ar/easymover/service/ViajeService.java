package edu.ar.easymover.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import edu.ar.easymover.model.Viaje;
import edu.ar.easymover.repository.ViajesRepository;

@Service
public class ViajeService {

    @Autowired
    private ViajesRepository viajesRepository;

    public List<Viaje> getAllViajes() {
        return viajesRepository.findAll();
    }

    public Viaje saveViaje(Viaje viaje) {
        return viajesRepository.save(viaje);
    }

    public Viaje getViajeById(Integer idViaje) {
        return viajesRepository.findById(idViaje).orElse(null);
    }

    public void deleteViaje(Integer idViaje) {
        viajesRepository.deleteById(idViaje);
    }

    // ⭐ Cálculo del costo total del viaje según la consigna
    public double calcularCosto(Viaje viaje) {

        double costoBase = 0;

        // Tipo de viaje: corta, media o larga distancia
        switch (viaje.getTipoViaje()) {
            case "corta":
                costoBase = 7000;
                break;

            case "media":
                costoBase = 7000;
                break;

            case "larga":
                costoBase = 20000;
                break;
        }

        // Tipo de vehículo: X, Luxe o Premium
        String tipoVehiculo = viaje.getVehicle().gettipoVehicle();

        if (tipoVehiculo.equalsIgnoreCase("Luxe")) {
            costoBase *= 1.10;  // +10%
        } else if (tipoVehiculo.equalsIgnoreCase("Premium")) {
            costoBase *= 1.20;  // +20%
        }

        return costoBase;
    }
}
