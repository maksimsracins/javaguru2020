package shoppinglist.service.validation.rules;

import shoppinglist.domain.Product;

public interface ProductValidationRule {

    void validate(Product product);

}
