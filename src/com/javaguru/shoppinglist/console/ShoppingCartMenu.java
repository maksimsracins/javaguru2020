package shoppinglist.console;

import java.util.Scanner;

public class ShoppingCartMenu {

    Scanner scanner = new Scanner(System.in);

    public Integer executeMenu() {


        System.out.println("1. Add product to shopping cart.");
        System.out.println("2. Get all products from shopping cart.");
        System.out.println("3. Get product by Id from shopping cart.\n");

        System.out.println("Please select an option: ");
        int userInput = Integer.parseInt(scanner.nextLine());

        return userInput;
    }
}
