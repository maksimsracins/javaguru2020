package shoppinglist.repository;

import shoppinglist.domain.Product;

public interface ProductRepository {

    Product addProduct(Product product);
    Product findProductById(Long id);

}
