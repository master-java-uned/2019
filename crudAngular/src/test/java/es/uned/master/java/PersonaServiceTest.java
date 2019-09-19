package es.uned.master.java;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.uned.master.java.model.PersonaRepository;
import es.uned.master.java.service.PersonaService;
import es.uned.master.java.service.PersonaServiceImp;

@SpringBootTest
public class PersonaServiceTest {
	@Autowired
	private PersonaService servicio;

	@DisplayName("Spring test integración Autowired")
	@Test
	void servicioTest() {
		// El registro de la tabla id= 3 tiene el nombre="Manuel"
		assertEquals("Manuel", this.servicio.listarId(3).getNombre());
	}

	@Mock
	private PersonaRepository repositorioMock;
	
	@InjectMocks //Inyecto manual de objeto
	private PersonaService servicioMock = new PersonaServiceImp();
	
	@BeforeEach
	public void setMockOutput() {
		when(this.repositorioMock.findById(3).get().getNombre()).thenReturn("Manuel");
	}
	
	@DisplayName("Spring test mockito integration Autowired")
	@Test
	void servicioMockitoTest(){
		assertEquals("Manuel", this.servicioMock.listarId(3).getNombre());
	}
}
