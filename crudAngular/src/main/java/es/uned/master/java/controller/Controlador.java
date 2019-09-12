package es.uned.master.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import es.uned.master.java.bean.Persona;
import es.uned.master.java.service.PersonaService;

@RestController
@CrossOrigin(origins= "http://localhost:4200", maxAge=3600)
@RequestMapping({"/personas"})
public class Controlador {
	@Autowired
	private PersonaService service;
	// private PersonaRepository repo;
	
	@GetMapping
	public List<Persona>listar(){
		return service.listar();
		// return repo.findAll();
	}
}
