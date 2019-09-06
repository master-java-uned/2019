package es.uned.master.java;

import java.math.BigDecimal;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;
import es.uned.master.java.beans.Product;
import es.uned.master.java.respository.ProductRepository;

@SpringBootApplication
public class Boot1Application implements CommandLineRunner{
	@Autowired
	ProductRepository productRepository;
	
	private static Logger log = (Logger) LoggerFactory.getLogger(Boot1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Boot1Application.class, args);
	}
 public void run(String... arg0) {
	 // Borro los datos del products
	 	 productRepository.deleteAll();
	 // Genero 10 registros nuevos
	 	 this.populateProducts();
	 // Listo los resultados.
	 	 for (Product product : productRepository.findAll()) {
			 this.escribeLog(product, "Find All");
		 }
	 // Para este caso he tenido que definir la query en una variable en el Interfaz repository
	 	 for (Product product : productRepository.search("C")) {
	 		 this.escribeLog(product, "Search");
	 	 }
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
 			this.productRepository.save(this.populateProduct("Caramelos", 33, "caramelos.png", 3000, "Caramelos para todos", true));
 			this.productRepository.save(this.populateProduct("Piruletas", 44, "piruletas.png", 1000, "Piruletas para todos", true));
 			this.productRepository.save(this.populateProduct("Polos", 55, "polos.png", 2000, "Polos para todos", true));
 			this.productRepository.save(this.populateProduct("Chicles", 99, "chicles.png", 500, "Chicles para todos", true));
 			this.productRepository.save(this.populateProduct("Petardos", 21, "petardos.png", 30, "Petardos para todos", true));
 			this.productRepository.save(this.populateProduct("Zapatos", 20, "zapatos.png", 301, "Zapatos para todos", true));
 			this.productRepository.save(this.populateProduct("Sandalias", 1, "sandalias.png", 32, "Sandalias para todos", true));
 			this.productRepository.save(this.populateProduct("Chinchetas", 2, "chinchetas.png", 56, "Chinchetas para todos", true));
 		}
 		private void escribeLog(Product product, String find) { 			 
 		 log.info("============="+ find + "=================");
		 log.info("Id: " + product.getId());
		 log.info("Name: " + product.getName());
		 log.info("Price: " + product.getPrice());
		 log.info("Quantity: " + product.getQuantity());
		 log.info("Description: " + product.getDescription());
		 log.info("Photo: " + product.getPhoto());
		 log.info("Featured: " + product.isFeatured());
		 log.info("========================================");
 		}
}
