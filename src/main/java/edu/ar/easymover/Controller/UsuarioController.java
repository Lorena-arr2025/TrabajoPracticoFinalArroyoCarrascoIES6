package edu.ar.easymover.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import edu.ar.easymover.Model.UsuarioModel;
import edu.ar.easymover.Service.UsuarioService;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // LISTAR USUARIOS
    @GetMapping("/usuario/lista")
    public ModelAndView listarUsuarios() {
        ModelAndView vista = new ModelAndView("usuario-lista");
        vista.addObject("usuarios", usuarioService.listarUsuarios());
        return vista;
    }

    // FORMULARIO NUEVO USUARIO
    @GetMapping("/usuario/nuevo")
    public ModelAndView nuevoUsuario() {
        ModelAndView vista = new ModelAndView("usuario-form");
        vista.addObject("usuario", new UsuarioModel());
        return vista;
    }

    // EDITAR USUARIO
    @GetMapping("/usuario/editar/{id}")
    public ModelAndView editarUsuario(@PathVariable Integer id) {
        ModelAndView vista = new ModelAndView("usuario-form");
        vista.addObject("usuario", usuarioService.buscarPorId(id));
        return vista;
    }

    // GUARDAR USUARIO (CREATE O UPDATE)
    @PostMapping("/usuario/guardar")
    public String guardarUsuario(UsuarioModel usuario) {
        usuarioService.guardarUsuario(usuario);
        return "redirect:/usuario/lista";
    }

    // ELIMINAR
    @GetMapping("/usuario/eliminar/{id}")
    public String eliminarUsuario(@PathVariable Integer id) {
        usuarioService.eliminarUsuario(id);
        return "redirect:/usuario/lista";
    }
    @GetMapping("/index")
public String index() {
    return "index";
}
}
