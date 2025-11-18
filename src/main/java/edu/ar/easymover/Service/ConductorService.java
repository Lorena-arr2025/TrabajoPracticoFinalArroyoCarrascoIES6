package edu.ar.easymover.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ar.easymover.Model.ConductorModel;
import edu.ar.easymover.Repository.ConductorRepository;

@Service
public class ConductorService {

    @Autowired
    private ConductorRepository conductorRepository;

    public List<ConductorModel> listarConductores() {
        return conductorRepository.findAll();
    }

    public ConductorModel guardarConductor(ConductorModel conductor) {
        return conductorRepository.save(conductor);
    }

    public ConductorModel buscarConductor(Integer id) {
        return conductorRepository.findById(id).orElse(null);
    }

    public void eliminarConductor(Integer id) {
        conductorRepository.deleteById(id);
    }
}
