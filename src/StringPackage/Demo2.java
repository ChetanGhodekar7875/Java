package StringPackage;

import java.util.Scanner;

public class Demo2 {
	//STRING s1=400,s2=100 ->OUTPUT=500
	//ADDITION OF TWO STRING WITHOUT PARSING
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER NUMBER ");
        String s1= scanner.next();
        System.out.println("ENTER NUMBER ");
        String s2= scanner.next();

        int num1=0,num2=0;

        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            num1=num1*10+(ch-'0');
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            num2=num2*10+(ch-'0');
        }
        System.out.println(num1+num2);

    }
}
