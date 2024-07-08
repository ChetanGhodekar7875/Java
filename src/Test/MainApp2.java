package Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();


        products.add(new Product(1, "Laptop", 999.99, 5));
        products.add(new Product(2, "Smartphone", 599.99, 10));
        products.add(new Product(3, "Headphones", 49.99, 20));

        while (true) {
            System.out.println("Product Purchase System Menu:");
            System.out.println("1. View Available Products");
            System.out.println("2. Purchase Product");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Products:");
                    for (Product product : products) {
                        product.displayProductInfo();
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Enter the product ID you want to purchase: ");
                    int productId = scanner.nextInt();
                    System.out.print("Enter the quantity you want to purchase: ");
                    int quantityToPurchase = scanner.nextInt();

                    for (Product product : products) {
                        if (product.getProductId() == productId) {
                            if (product.getQuantity() >= quantityToPurchase) {
                                product.setQuantity(product.getQuantity() - quantityToPurchase);
                                double totalCost = product.getPrice() * quantityToPurchase;
                                System.out.println("Purchase successful!");
                                System.out.println("Total cost: $" + totalCost);
                            } else {
                                System.out.println("Insufficient quantity available.");
                            }
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting Product Purchase System.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

