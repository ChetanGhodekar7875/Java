package Looping;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=0;

        while (i>=0){
            System.out.println("ENTER NUMBER ");
            i= scanner.nextInt();
            System.out.println("NUMBER VALUE IS "+i);
        }
    }
}
