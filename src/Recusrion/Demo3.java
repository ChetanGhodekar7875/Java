package Recusrion;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        int row=0;
        int num=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS");
        row=scanner.nextInt();
        int space=row-1,col=1;
        for(int i=1;i<=row;i++){
            int temp=num;
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=col;j++){
                if(j<i)
                System.out.print(temp--);
                else
                System.out.print(temp++);
            }
            System.out.println();
            num++;
            col=col+2;
            space--;
        }
    }
}
