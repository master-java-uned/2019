package es.uned.master.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import es.uned.master.java.bean.Persona;
import es.uned.master.java.model.PersonaRepository;

@Service
public class PersonaServiceImp implements PersonaService{
	@Autowired
	PersonaRepository repositorio;

	@Override
	public List<Persona> listar() {
		return this.repositorio.findAll();
	}

	@Override
	public Persona listarId(int id) {
		return this.repositorio.findById(id).get();
	}

	@Override
	public Persona add(Persona p) {
		return this.repositorio.save(p);
	}

	@Override
	public Persona edit(Persona p) {
		return this.repositorio.save(p);
	}

	@Override
	public void delete(int id) {
		this.delete(id);
	}
}
