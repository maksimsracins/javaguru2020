package shoppinglist.repository;

import shoppinglist.domain.Product;

import java.util.HashMap;

public class ProductInMemoryRepository implements ProductRepository {
    HashMap<Long, Product> repository = new HashMap<>();
    Long autoIncrementId = 0L;

    @Override
    public Product addProduct(Product product){
        repository.put(autoIncrementId, product);
        return product;
    }
    @Override
    public Product findProductById(Long id){
        return repository.get(id);
    }
}
