package Looping;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS");
        int row= scanner.nextInt();
        int col=row,space=row-1;
        for(int i=1;i<=row;i++){
            char ch='A';
            for(int j=1;j<=col;j++){
                if(j<=space){
                    System.out.print(" ");
                }else {
                    System.out.print(ch++);
                }
            }
            System.out.println();
            space--;
        }
    }
}
