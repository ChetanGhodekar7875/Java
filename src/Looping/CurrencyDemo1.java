package Looping;

import java.util.Scanner;

public class CurrencyDemo1 {
    public static void main(String[] args) {
        System.out.println("ENTER AMOUNT ");
        Scanner scanner=new Scanner(System.in);
        int amount= scanner.nextInt();

        int rs500=0,rs200=0,rs100=0;
        if(amount%100==0 && amount>=100) {
            rs500 = amount / 500;
            amount = amount % 500;

            rs200 = amount / 200;
            amount = amount % 200;

            rs100 = amount / 100;

            System.out.println("500 NOTES ARE " + rs500);
            System.out.println("200 NOTES ARE " + rs200);
            System.out.println("100 NOTES ARE " + rs100);
        }else {
            System.out.println("INVALID AMOUNT");
        }
    }
}
