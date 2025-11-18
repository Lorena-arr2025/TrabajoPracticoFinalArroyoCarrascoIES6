package edu.ar.easymover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.ar.easymover.model.Viaje;
import edu.ar.easymover.service.VehicleService;
import edu.ar.easymover.service.ViajeService;

@Controller
public class ViajeController {

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private ViajeService viajeService;

    // 1. FORMULARIO PARA CREAR UN NUEVO VIAJE
    @GetMapping("/viajes/nuevo")
    public ModelAndView nuevoViaje() {
        ModelAndView mav = new ModelAndView("Viajes");

        mav.addObject("viajeNuevo", new Viaje());  
        mav.addObject("vehiculos", vehicleService.listarTodos()); 

        return mav;
    }

    // 2. GUARDAR EL VIAJE
    @PostMapping("/viajes/guardar")
    public ModelAndView guardarViaje(@ModelAttribute("viajeNuevo") Viaje viaje) {
        viajeService.saveViaje(viaje);
        
        ModelAndView mav = new ModelAndView("redirect:/viajes/nuevo");
        return mav;
    }
}
