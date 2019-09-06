package es.uned.master.java.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity (name = "Book_category")
@Data
@ToString(callSuper=true, includeFieldNames=true)
@EqualsAndHashCode (exclude="books")
public class BookCategory{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column (unique=true)
	@NotNull
	private String name;
	
	@OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
	private Set<Book> books;
	
	public BookCategory(){
	
	}

    public BookCategory(String name) {
        this.name = name;
    }
    
	// Getter and Setter from Lombok
}
