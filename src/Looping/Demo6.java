package Looping;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER ");
        int fNum= scanner.nextInt();
        System.out.println("ENTER SECOND NUMBER ");
        int sNum= scanner.nextInt();

        for(int i=1;i<=5;i++){
            int num1=fNum,num2=sNum;
            for(int j=1;j<=i;j++){
                System.out.print(num1+" ");
                int add=num1+num2;
                num1=num2;
                num2=add;
            }
            System.out.println();
        }
    }
}
