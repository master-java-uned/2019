package es.uned.master.java.service;

import java.util.List;

import es.uned.master.java.bean.Persona;

public interface PersonaService {

	public List<Persona> listar();

	public Persona listarId(int id);

	public Persona add(Persona p);

	public Persona edit(Persona p);

	public void delete (int id);

}
