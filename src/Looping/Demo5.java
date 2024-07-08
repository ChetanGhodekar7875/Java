package Looping;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER ");
        int fNum= scanner.nextInt();
        System.out.println("ENTER SECOND NUMBER ");
        int sNum= scanner.nextInt();
        System.out.println("ENTER NUMBER OF ITERATION");
        int itr= scanner.nextInt();

        System.out.print(fNum+"  "+sNum+"  \n");

        for(int i=1;i<=itr;i++){
            int add=fNum+sNum;
            System.out.println(fNum+"+"+sNum+"="+add+"  ");
            fNum=sNum;
            sNum=add;
        }

    }
}
