package shoppinglist.repository;

import shoppinglist.domain.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class ShoppingCartInMemoryRepository implements ShoppingCartRepository{

    HashMap<Long,Product> shoppingCartRepository = new HashMap<>();
    Long autoIncrementId = 0L;

    @Override
    public Optional<Product> saveProduct(Product product) {
        return Optional.ofNullable(shoppingCartRepository.put(autoIncrementId, product));
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return Optional.ofNullable(shoppingCartRepository.get(id));
    }

    @Override
    public Optional<Product> deleteProductById(Long id) {
        return Optional.ofNullable(shoppingCartRepository.remove(id));

    }

    @Override
    public List<Product> getListOfProducts() {
        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.addAll(shoppingCartRepository.values());
        return listOfProducts;
    }

    @Override
    public BigDecimal getShoppingCartTotalSum() {
        return null;
    }
}
