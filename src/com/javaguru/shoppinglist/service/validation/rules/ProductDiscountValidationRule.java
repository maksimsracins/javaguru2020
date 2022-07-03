package shoppinglist.service.validation.rules;

import shoppinglist.domain.Product;
import shoppinglist.service.exception.ProductValidationException;

import java.math.BigDecimal;

public class ProductDiscountValidationRule implements ProductValidationRule{
    @Override
    public void validate(Product product) {
        if (product.getDiscount().compareTo(new BigDecimal("100")) > 0){
            throw new ProductValidationException("Discount cannot be greater than 100.");
        }
        if (product.getDiscount().compareTo(new BigDecimal("0")) < 0){
            throw new ProductValidationException("Discount cannot be less than 0.");
        }
    }
}
