package shoppinglist.service;

import shoppinglist.domain.Product;
import shoppinglist.repository.ProductRepository;
import shoppinglist.repository.ShoppingCartRepository;
import shoppinglist.service.validation.rules.ProductValidationRule;

import java.util.List;

public class ShoppingCartService {

    private ProductRepository productInMemoryRepository;
    private ShoppingCartRepository shoppingCartRepository;
    private ProductValidationRule productValidationRule;

    public ShoppingCartService(ProductRepository productInMemoryRepository,
                               ShoppingCartRepository shoppingCartRepository,
                               ProductValidationRule productValidationRule) {
        this.productInMemoryRepository = productInMemoryRepository;
        this.shoppingCartRepository = shoppingCartRepository;
        this.productValidationRule = productValidationRule;
    }

    public List<Product> retrieveAllProduct(){
        return shoppingCartRepository.getListOfProducts();
    }

    public Product saveProduct(Product product){
        return shoppingCartRepository.saveProduct(product).get();
    }
    public Product getProductById(Long id){
        return shoppingCartRepository.getProductById(id).get();
    }
    public Product deleteProductById(Long id){
        return shoppingCartRepository.deleteProductById(id).get();
    }
}
