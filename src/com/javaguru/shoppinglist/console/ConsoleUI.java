package shoppinglist.console;

import shoppinglist.domain.Product;
import shoppinglist.service.ProductService;
import shoppinglist.service.ShoppingCartService;
import shoppinglist.service.exception.ProductNotFoundException;

import java.math.BigDecimal;
import java.util.Scanner;

public class ConsoleUI {

    private ProductService productService;
    private ShoppingCartService shoppingCartService;

    public ConsoleUI(ProductService productService,
                     ShoppingCartService shoppingCartService){
        this.productService = productService;
        this.shoppingCartService = shoppingCartService;
    }

    public void start(){

        Scanner scanner = new Scanner(System.in);

        while (true){
            try{
                System.out.println("1. Create product.");
                System.out.println("2. Find product by id.");
                System.out.println("3. Get list of products.");
                System.out.println("4. Exit");
                scanner.nextLine();
                int userInput = Integer.parseInt(scanner.nextLine());

                switch (userInput){
                    case 1:
                        System.out.println("Enter product name: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter product price: ");
                        BigDecimal price = new BigDecimal(String.valueOf(scanner.nextBigDecimal()));
                        System.out.println("Enter product discount: ");
                        BigDecimal discount = new BigDecimal(String.valueOf(scanner.nextBigDecimal()));

                        Product product = new Product();
                        product.setName(name);
                        product.setDiscount(discount);
                        product.setPrice(price);

                        Product addedProduct = productService.addProduct(product);
                        if (addedProduct != null){
                            System.out.println("Product is added.");
                        }
                        break;
                    case 2:
                        System.out.println("Enter product id: ");
                        Long productId = Long.valueOf(scanner.nextLine());
                        Product foundProduct = productService.getProductById(productId);
                        System.out.println("Your product:" + foundProduct);
                        break;
                    case 3:

                        break;

                        case 4:
                        System.out.println(System.out);
                        break;
                }
            }
            catch (ProductNotFoundException e){
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                System.out.println("Error! Incorrect value.");
            }
        }
    }
}
