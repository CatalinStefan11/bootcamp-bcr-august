package ro.bcr.product_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.bcr.product_app.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}
