package edu.ar.easymover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ar.easymover.model.Vehicle;
import edu.ar.easymover.repository.VehicleRepository;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    // ✔ Listar todos los vehículos
    public List<Vehicle> listarTodos() {
        return vehicleRepository.findAll();
    }

    // ✔ Guardar un vehículo
    public void guardar(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    // ✔ Buscar por ID (opcional)
    public Vehicle buscarPorId(Integer id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    // ✔ Eliminar (lógica o física)
    public void eliminar(Integer id) {
        vehicleRepository.deleteById(id);
    }


}
