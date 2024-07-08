package Recusrion;

import java.util.Scanner;

public class MainApp1 {
    static int revNum=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int num= scanner.nextInt();
        int result=test(num);
        System.out.println("REVERSE NUMBER IS "+result);

        if(num==result){
            System.out.println("PALINDROME");
        }else {
            System.out.println("NUMBER IS NOT PALINDROME");
        }
    }
    public static int test(int num){
  //      int temp=num;
//       while (temp!=0){
//           int rem=temp%10;
//           revNum=revNum*10+rem;
//           temp/=10;
//       }

        if(num!=0){
            int rem=num%10;
            revNum=revNum*10+rem;
            num/=10;
            test(num);
        }
      return revNum;
    }
}
