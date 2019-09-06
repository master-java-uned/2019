package es.uned.master.java.beans;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name ="product")
@Data
@ToString
public class Product {
	
	//Creación del Id clave de Product
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private BigDecimal price;
	private int quantity;
	private String description;
	private String photo;
	private boolean featured;
	
	//Getters ans Setter by Lombok.
	
}
