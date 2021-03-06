package shoppinglist.service.validation.rules;

import shoppinglist.domain.Product;
import shoppinglist.service.exception.ProductValidationException;

import java.math.BigDecimal;

public class ProductPriceValidationRule implements ProductValidationRule {

    @Override
    public void validate(Product product) {
        if (product.getPrice().compareTo(new BigDecimal("0")) <= 0) {
            throw new ProductValidationException("Price cannot be 0 or negative.");
        }
        else if(product.getPrice().compareTo(new BigDecimal("1000")) > 0){
            throw new ProductValidationException("Price cannot be greater than 1000");
        }
        }
}
