package es.uned.master.java;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import es.uned.master.java.Repository.BookCategoryRepository;
import es.uned.master.java.beans.Book;
import es.uned.master.java.beans.BookCategory;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaOneToManyExampleApplicationTests{
	@Autowired
	private BookCategoryRepository bookCategoryRepository;

	@Test
	public void contextLoads(){
	}

	@Test
	public void oneToManyExampleTest(){
		// Borrar todo.
		this.bookCategoryRepository.deleteAll();
		// Guadar algunos registros
		final BookCategory categoryA = new BookCategory("Category A");
        Set<Book> bookAs = new HashSet<>();
        bookAs.add(new Book("Book A1", categoryA));
        bookAs.add(new Book("Book A2", categoryA));
        bookAs.add(new Book("Book A3", categoryA));
        categoryA.setBooks(bookAs);

        final BookCategory categoryB = new BookCategory("Category B");
        Set<Book> bookBs = new HashSet<>();
        bookBs.add(new Book("Book B1", categoryB));
        bookBs.add(new Book("Book B2", categoryB));
        bookBs.add(new Book("Book B3", categoryB));
        categoryB.setBooks(bookBs);
        List<BookCategory> bookCategory = Arrays.asList(categoryA, categoryB);
        
        this.bookCategoryRepository.saveAll(bookCategory);
		assertTrue(bookCategory.containsAll(this.bookCategoryRepository.findAll()));
	}
}
