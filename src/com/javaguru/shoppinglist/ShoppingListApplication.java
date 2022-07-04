package shoppinglist;

import shoppinglist.console.ConsoleUI;
import shoppinglist.console.ShoppingCartMenu;
import shoppinglist.repository.ProductInMemoryRepository;
import shoppinglist.repository.ProductRepository;
import shoppinglist.repository.ShoppingCartInMemoryRepository;
import shoppinglist.repository.ShoppingCartRepository;
import shoppinglist.service.ProductService;
import shoppinglist.service.ShoppingCartService;
import shoppinglist.service.validation.rules.ProductPriceValidationRule;
import shoppinglist.service.validation.rules.ProductValidationRule;

public class ShoppingListApplication {
    public static void main(String[] args) {

        ProductValidationRule validationRule = new ProductPriceValidationRule();
        ShoppingCartRepository shoppingCartRepository = new ShoppingCartInMemoryRepository();
        ProductRepository repository = new ProductInMemoryRepository();
        ShoppingCartService shoppingCartService = new ShoppingCartService(repository, shoppingCartRepository, validationRule);
        ShoppingCartMenu shoppingCartMenu = new ShoppingCartMenu();

        ProductService service = new ProductService(repository, validationRule);
        ConsoleUI consoleUI = new ConsoleUI(service, shoppingCartService, shoppingCartMenu);
        consoleUI.start();
    }
}
