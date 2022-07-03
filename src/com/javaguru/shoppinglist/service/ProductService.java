package shoppinglist.service;

import shoppinglist.domain.Product;
import shoppinglist.repository.ProductRepository;
import shoppinglist.service.exception.ProductNotFoundException;
import shoppinglist.service.validation.rules.ProductValidationRule;

import java.util.List;

public class ProductService {

    private ProductRepository productInMemoryRepository;
    private ProductValidationRule productValidationRule;

    public ProductService( ProductRepository productRepository, ProductValidationRule productValidationRule){
        this.productInMemoryRepository = productRepository;
        this.productValidationRule = productValidationRule;
    }

    public Product addProduct(Product product){
        productValidationRule.validate(product);
        return productInMemoryRepository.addProduct(product);
    }
    public Product getProductById(Long id){
       return productInMemoryRepository.findProductById(id)
               .orElseThrow(() -> new ProductNotFoundException("Product not found, id: " + id));
    }

}
