package shoppinglist;

import shoppinglist.console.ConsoleUI;
import shoppinglist.repository.ProductInMemoryRepository;
import shoppinglist.repository.ProductRepository;
import shoppinglist.service.ProductService;
import shoppinglist.service.validation.rules.ProductPriceValidationRule;
import shoppinglist.service.validation.rules.ProductValidationRule;

public class ShoppingListApplication {
    public static void main(String[] args) {

        ProductValidationRule validationRule = new ProductPriceValidationRule();
        ProductRepository repository = new ProductInMemoryRepository();

        ProductService service = new ProductService(repository, validationRule);
        ConsoleUI consoleUI = new ConsoleUI(service);
        consoleUI.start();
    }
}
