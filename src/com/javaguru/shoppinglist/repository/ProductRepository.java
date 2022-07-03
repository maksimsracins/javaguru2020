package shoppinglist.repository;

import shoppinglist.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    Product addProduct(Product product);
    Optional<Product> findProductById(Long id);
    List<Product> listOfAllProducts();
}
