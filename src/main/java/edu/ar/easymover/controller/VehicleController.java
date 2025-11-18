package edu.ar.easymover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.ar.easymover.model.Vehicle;
import edu.ar.easymover.service.VehicleService;

@Controller
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    // ⭐ 1. Mostrar formulario para crear vehículo
    @GetMapping("/nuevo")
    public ModelAndView nuevoVehiculo() {
        ModelAndView mav = new ModelAndView("Vehiculo");

        mav.addObject("vehiculoNuevo", new Vehicle());  // objeto vacío para el form
        return mav;
    }

    // ⭐ 2. Guardar vehículo
    @PostMapping("/guardar")
    public ModelAndView guardarVehiculo(@ModelAttribute("vehiculoNuevo") Vehicle vehiculo) {
        vehicleService.saveVehicle(vehiculo);

        return new ModelAndView("redirect:/vehicles/listar");
    }

    // ⭐ 3. Listar todos los vehículos
    @GetMapping("/listar")
    public ModelAndView listarVehiculos() {
        ModelAndView mav = new ModelAndView("ListaVehiculos");

        mav.addObject("vehiculos", vehicleService.getAllVehicles());
        return mav;
    }
}

 

