package es.uned.master.java.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.uned.master.java.bean.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{
}
