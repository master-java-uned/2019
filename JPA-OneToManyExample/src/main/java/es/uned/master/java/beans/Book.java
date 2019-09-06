package es.uned.master.java.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@ToString
@EqualsAndHashCode (exclude = "bookCategory")
public class Book{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column (name="Name", unique=true)
	@NotNull
	private String name;
	
	@ManyToOne
	@JoinColumn(name="book_category_id")
	private BookCategory bookCategory;

    public Book() {

    }

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, BookCategory bookCategory) {
        this.name = name;
        this.bookCategory = bookCategory;
    }

    @Override
    public String toString() {
    	return this.name;
    }
	// Getter and Setter from Lombok
	
}
