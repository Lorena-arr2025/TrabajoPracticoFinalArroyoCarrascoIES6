package edu.ar.easymover.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")

public class UsuarioController {
     @GetMapping
    public String getusuario () {
        return "usuario"; // Devuelve el nombre de la vista vehíulo
    }

}
