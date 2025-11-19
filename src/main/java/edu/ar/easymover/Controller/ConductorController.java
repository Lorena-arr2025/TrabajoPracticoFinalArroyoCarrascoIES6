package edu.ar.easymover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import edu.ar.easymover.model.ConductorModel;
import edu.ar.easymover.service.ConductorService;

@Controller
@RequestMapping("/conductor")
public class ConductorController {

    @Autowired
    private ConductorService conductorService;

    @GetMapping("/lista")
    public String listar(Model model) {
        model.addAttribute("conductores", conductorService.listarConductores());
        return "conductor-lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("conductor", new ConductorModel());
        return "conductor-form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute ConductorModel conductor) {
        conductorService.guardarConductor(conductor);
        return "redirect:/conductor/lista";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        model.addAttribute("conductor", conductorService.buscarConductor(id));
        return "conductor-form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        conductorService.eliminarConductor(id);
        return "redirect:/conductor/lista";
    }
}
