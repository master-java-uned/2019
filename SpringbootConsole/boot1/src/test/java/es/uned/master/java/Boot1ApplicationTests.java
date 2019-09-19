package es.uned.master.java;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import es.uned.master.java.beans.Product;
import es.uned.master.java.respository.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Boot1ApplicationTests {
	@Autowired
	private ProductRepository productRepository;
	private List<Product> productos;
	


	@Test
	public void contextLoads() {
	}

	@Test
	public void productLombokTest() {
		Product p = new Product();
		p.setName("Carlos");
		assertFalse(p.getName().equals("Carlosss"));
	}
		private Product populateProduct(String nombre, int precio, String image, 
					int cantidad, String descripcion, boolean feature) {
			Product producto = new Product();
			producto.setName(nombre);
			producto.setPrice(new BigDecimal(precio));
			producto.setPhoto(image);
			producto.setQuantity(cantidad);
			producto.setDescription(descripcion);
			producto.setFeatured(feature);
			return producto;
		}

		private void populateProducts() {
			this.productos = new ArrayList<Product>();
				this.productos.add(this.populateProduct("Caramelos", 33, "caramelos.png", 3000, "Caramelos para todos", true));
				this.productos.add(this.populateProduct("Piruletas", 44, "piruletas.png", 1000, "Piruletas para todos", true));
				this.productos.add(this.populateProduct("Polos", 55, "polos.png", 2000, "Polos para todos", true));
				this.productos.add(this.populateProduct("Chicles", 99, "chicles.png", 500, "Chicles para todos", true));
				this.productos.add(this.populateProduct("Petardos", 21, "petardos.png", 30, "Petardos para todos", true));
				this.productos.add(this.populateProduct("Zapatos", 20, "zapatos.png", 301, "Zapatos para todos", true));
				this.productos.add(this.populateProduct("Sandalias", 1, "sandalias.png", 32, "Sandalias para todos", true));
				this.productos.add(this.populateProduct("Chinchetas", 2, "chinchetas.png", 56, "Chinchetas para todos", true));
 		}

		private void saveProduct(List<Product> productos) {
			for (Product prod : productos){
				this.productRepository.save(prod);
			}
		}

	@Test
	public void productfindAllTest() throws Exception {
		 // Borro los datos del products
	 	 productRepository.deleteAll();
	     //Genero 10 registros nuevos
	 	 this.populateProducts();
	 	 // Compruebo que ambos arrays son iguales
	 	 assertTrue(this.productos.containsAll(this.productRepository.findAll()));
	}

	@Test
	public void productSearchTest() throws Exception {
		 // Borro los datos del products
	 	 productRepository.deleteAll();
	     //Genero 10 registros nuevos
	 	 this.populateProducts();
	 	 // Compruebo que ambos arrays son iguales
	 	 assertTrue(this.productos.containsAll(this.productRepository.search("C")));
	}
}