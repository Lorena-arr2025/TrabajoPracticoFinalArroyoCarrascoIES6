package edu.ar.easymover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import edu.ar.easymover.model.Viaje;
import edu.ar.easymover.service.ViajeService;
import edu.ar.easymover.service.VehicleService;

@Controller
@RequestMapping("/viajes")
public class ViajeController {

    @Autowired
    private ViajeService viajeService;

    @Autowired
    private VehicleService vehicleService; 
    // Esto sirve para mostrar vehículos disponibles cuando creás un viaje

    // ⭐ 1. MOSTRAR FORMULARIO PARA CREAR VIAJE
    @GetMapping("/nuevo")
    public ModelAndView nuevoViaje() {
        ModelAndView mav = new ModelAndView("Viajes");

        mav.addObject("viajeNuevo", new Viaje());                     // objeto vacío
        mav.addObject("vehiculos", vehicleService.getAllVehicles());  // lista de vehículos

        return mav;
    }

    // ⭐ 2. GUARDAR VIAJE (POST)
    @PostMapping("/guardar")
    public ModelAndView guardarViaje(@ModelAttribute("viajeNuevo") Viaje viaje) {

        // Calcular costo automáticamente
        double costo = viajeService.calcularCosto(viaje);
        viaje.setCosto(costo);

        viajeService.saveViaje(viaje);

        ModelAndView mav = new ModelAndView("redirect:/viajes/listar");

        return mav;
    }

    // ⭐ 3. LISTAR VIAJES
    @GetMapping("/listar")
    public ModelAndView listarViajes() {
        ModelAndView mav = new ModelAndView("ListaViajes");

        mav.addObject("viajes", viajeService.getAllViajes());

        return mav;
    }

    // ⭐ 4. ELIMINAR (OPCIONAL)
    @GetMapping("/eliminar/{id}")
    public ModelAndView eliminarViaje(@PathVariable Integer id) {
        viajeService.deleteViaje(id);
        return new ModelAndView("redirect:/viajes/listar");
    }
}


