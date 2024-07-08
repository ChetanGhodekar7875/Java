package Looping;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER NUMBER ");
        int num= scanner.nextInt();

        int temp=num,sum=0;

        while (num!=0){
            int reminder=num%10;
            int fact=1;
            for(int i=1;i<=reminder;i++){
                fact=fact*i;
            }
            sum+=fact;
            num/=10;
        }
        if(temp==sum){
            System.out.println("STRONG NUMBER");
        }else {
            System.out.println("NOT A STRONG NUMBER");
        }
    }
}
