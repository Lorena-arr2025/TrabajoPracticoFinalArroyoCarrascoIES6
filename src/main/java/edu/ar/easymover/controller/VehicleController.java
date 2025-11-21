package edu.ar.easymover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.ar.easymover.model.Vehicle;
//import edu.ar.easymover.service.VehicleService;

@Controller
@RequestMapping("/vehiculos")
public class VehicleController {

    //@Autowired
    //private VehicleService vehicleService;

    // Muestra el formulario
    @GetMapping("/nuevo")
    public String mostrarFormulario() {
        return "VehiculoForm";  
    }

    // Guarda el vehículo
    @PostMapping("/guardar")
    public String guardarVehiculo(Vehicle vehicle) {
      //  vehicleService.guardar(vehicle);
        return "redirect:/vehiculos/lista";
    }

    // Lista de vehículos
    @GetMapping("/lista")
    public ModelAndView mostrarLista() {
        ModelAndView mav = new ModelAndView("listaVehiculos");
        //mav.addObject("vehiculos", vehicleService.listarTodos());
        return mav;
    }
}
