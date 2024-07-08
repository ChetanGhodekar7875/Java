package Array;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean status=true;
        while (status) {
            System.out.println("1. DISPLAY PRODUCTS ");
            System.out.println("2. PURCHASE PRODUCTS ");
            System.out.println("3. DISPLAY BILL ");
            System.out.println("4. EXIT ");
            System.out.println("ENTER YOUR CHOICE ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    ProductSimulation.displayProduct();
                    break;
                case 2:
                    System.out.println("ENTER PRODUCT NAME");
                    String Name= scanner.next();
                    System.out.println("ENTER PRODUCT QTY");
                    int qty= scanner.nextInt();
                    ProductSimulation.purchaseProduct(Name,qty);
                    break;
                case 3:
                    ProductSimulation.displayBill();
                    break;
                case 4:
                    System.out.println("THANK U FOR VISITING !");
                    status=false;
                    break;
                default:
                    System.out.println("INVALID OPTION");
                    break;
            }
        }
    }
}
