package shoppinglist.repository;

import shoppinglist.domain.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class ProductInMemoryRepository implements ProductRepository {
    HashMap<Long, Product> repository = new HashMap<>();
    Long autoIncrementId = 0L;

    @Override
    public Product addProduct(Product product){
        repository.put(autoIncrementId, product);
        autoIncrementId++;
        return product;
    }
    @Override
    public Optional<Product> findProductById(Long id){
        return Optional.ofNullable(repository.get(id));
    }

    @Override
    public List<Product> listOfAllProducts() {
        ArrayList<Product> listOfProducts = new ArrayList<>(repository.values());
        return listOfProducts;
    }
}
