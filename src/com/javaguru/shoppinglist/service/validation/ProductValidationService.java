package shoppinglist.service.validation;

import shoppinglist.domain.Product;
import shoppinglist.service.validation.rules.ProductNameValidationRule;
import shoppinglist.service.validation.rules.ProductPriceValidationRule;
import shoppinglist.service.validation.rules.ProductValidationRule;

import java.util.HashSet;
import java.util.Set;

public class ProductValidationService {

    private Set<ProductValidationRule> validationRules = new HashSet<>();

    public ProductValidationService(){
        validationRules.add(new ProductNameValidationRule());
        validationRules.add(new ProductPriceValidationRule());
    }
    void validate(final Product product){
        validationRules.forEach(rule -> rule.validate(product));
    }

}
