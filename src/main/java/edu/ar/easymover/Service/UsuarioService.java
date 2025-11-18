package edu.ar.easymover.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.ar.easymover.Model.UsuarioModel;
import edu.ar.easymover.Repository.UsuarioRepository;

public class UsuarioService {
  @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioModel> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public UsuarioModel buscarUsuario(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public void eliminarUsuario(Integer id) {
        usuarioRepository.deleteById(id);
    }  
}
