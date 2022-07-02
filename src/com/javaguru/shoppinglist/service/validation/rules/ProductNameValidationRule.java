package shoppinglist.service.validation.rules;

import shoppinglist.domain.Product;

public class ProductNameValidationRule implements ProductValidationRule {
    @Override
    public void validate(Product product) {
        if (product.getName() == null){
            throw new IllegalArgumentException("Product name must not be null!");
        }
    }
}
