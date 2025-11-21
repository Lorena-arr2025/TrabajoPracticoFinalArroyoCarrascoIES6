package edu.ar.easymover.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.ar.easymover.model.Viaje;

@Repository
public interface ViajesRepository extends JpaRepository<Viaje, Integer> {
    // Repository de la entidad Viaje
}
