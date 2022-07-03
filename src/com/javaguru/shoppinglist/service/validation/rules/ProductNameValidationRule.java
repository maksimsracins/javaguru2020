package shoppinglist.service.validation.rules;

import shoppinglist.domain.Product;
import shoppinglist.service.exception.ProductValidationException;

public class ProductNameValidationRule implements ProductValidationRule {
    @Override
    public void validate(Product product) {
        if (product.getName() == null){
            throw new ProductValidationException("Product name must not be null.");
        } if (product.getName().length() < 3 || product.getName().length() > 32){
            throw new ProductValidationException("Product length should be min:3 and max:32 characters.");
        }
    }
}
