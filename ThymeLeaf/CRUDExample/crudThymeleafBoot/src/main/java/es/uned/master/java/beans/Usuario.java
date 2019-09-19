package es.uned.master.java.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(unique=true)
	@NotBlank(message = "Nombre es obligatorio")
	private String nombre;
	
	@Column
	@NotBlank(message = "Correo es obliatorio")
	private String email;
	
	
	// Standar constructors, getter and setter + toString
}
