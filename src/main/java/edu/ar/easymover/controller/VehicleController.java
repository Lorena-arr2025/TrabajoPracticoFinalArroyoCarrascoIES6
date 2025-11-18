package edu.ar.easymover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.ar.easymover.service.VehicleService;

@Controller
@RequestMapping("/vehiculos")   // ✔ RUTA CORRECTA
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    // ✔ Muestra el formulario para crear un vehículo
    @GetMapping("/nuevo")
    public String mostrarFormulario() {
        return "Vehiculo";   // Debe coincidir con el archivo Vehiculo.html
    }

    // ✔ Muestra la lista de vehículos
    @GetMapping("/lista")
    public ModelAndView mostrarLista() {
        ModelAndView mav = new ModelAndView("listaVehiculos");  // Debe coincidir con listaVehiculos.html
        mav.addObject("vehiculos", vehicleService.listarTodos());
        return mav;
    }
}

