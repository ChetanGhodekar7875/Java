package Looping;

import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER NUMBER ");
        int num= scanner.nextInt();
        isPrime(num);
    }
    private static void isPrime(int num) {
        int i=1,count=0;

        while (i<=num){
            if(num%i==0){
                count++;
            }
            i++;
        }

        if(count==2){
            System.out.println("NUMBER IS PRIME NUMBER");
        }else {
            System.out.println("NUMBER IS NOT PRIME NUMBER");
        }
    }
}
