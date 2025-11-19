package edu.ar.easymover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ar.easymover.model.UsuarioModel;
import edu.ar.easymover.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // LISTAR
    public List<UsuarioModel> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    // GUARDAR (crear o editar)
    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    // BUSCAR POR ID
    public UsuarioModel buscarPorId(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    // ELIMINAR
    public void eliminarUsuario(Integer id) {
        usuarioRepository.deleteById(id);
    }
}
