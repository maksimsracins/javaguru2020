package shoppinglist.repository;

import shoppinglist.domain.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface ShoppingCartRepository {

    // Сохранение, получение, удаление корзины
    // Добавление продукта в корзину
    // Получение списка продуктов (в корзине)
    // Получение общей стоимости продуктов в корзине

    Optional<Product> saveProduct(Product product);
    Optional<Product> getProductById(Long id);
    Optional<Product> deleteProductById(Long id);
    List<Product> getListOfProducts();
    BigDecimal getShoppingCartTotalSum();

}
