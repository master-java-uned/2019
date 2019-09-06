package es.uned.master.java.respository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import es.uned.master.java.beans.Product;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Integer> {
	@Query("from Product where name like %:keyword%")
	public List<Product> search(@Param("keyword") String keyword);
}
