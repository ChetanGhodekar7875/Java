package Operator;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int num= scanner.nextInt();
       String output=(num%5==0)?"DIVISIBLE BY 5":"NOT DIVISIBLE BY 5";
        System.out.println(output);
        System.out.println("=============================");
        String result=(num%5==0)?((num>0)?"+ve & DIVISIBLE BY5":"-ve & DIVISIBLE BY 5"):
                ((num>0)?"+ve & NOT DIVISIBLE BY5":"-ve & NOT DIVISIBLE BY 5");
        System.out.println(result);
    }
}
