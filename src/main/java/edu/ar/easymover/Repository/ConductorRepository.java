package edu.ar.easymover.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.ar.easymover.Model.ConductorModel;

@Repository
public interface ConductorRepository extends JpaRepository<ConductorModel, Integer> {

}

