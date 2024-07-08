package Test1;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
       int num=5;
       int fact=1;
       for(int i=num;i>=1;i--){
           fact=fact*i;
       }
        System.out.println(num+" FACTORIAL IS "+fact);
    }
}
