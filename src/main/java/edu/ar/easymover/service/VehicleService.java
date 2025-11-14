package edu.ar.easymover.service;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
import java.util.List;
import edu.ar.easymover.model.Vehicle;
import edu.ar.easymover.repository.VehicleRepository;

@Service

public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

  // Obtener los vehículos..

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    // Guardar un vehículo..
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    // Eliminar un vehículo por ID..

    public void deleteVehicle(Integer id) {
        vehicleRepository.deleteById(id);
    }

    // Buscar un vehículo por ID..

    public Vehicle getVehicleById(Integer id) {
        return vehicleRepository.findById(id).orElse(null);
    }

}
