package edu.ar.easymover.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import edu.ar.easymover.model.Viaje;
import edu.ar.easymover.repository.ViajesRepository;

@Service
public class ViajeService {

    @Autowired
    private ViajesRepository viajeRepository;

    public List<Viaje> getAllViajes() {
        return viajeRepository.findAll();
    }

    public Viaje saveViaje(Viaje viaje) {
        // Si luego agregamos tipoViaje, se calcula aquí.
        return viajeRepository.save(viaje);
    }

    public Viaje getViajeById(Integer idViaje) {
        return viajeRepository.findById(idViaje).orElse(null);
    }

    public void deleteViaje(Integer idViaje) {
        viajeRepository.deleteById(idViaje);
    }
}
