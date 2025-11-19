package edu.ar.easymover.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.ar.easymover.model.ConductorModel;

@Repository
public interface ConductorRepository extends JpaRepository<ConductorModel, Integer> {

}

