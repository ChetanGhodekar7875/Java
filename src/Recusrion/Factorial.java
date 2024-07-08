package Recusrion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5,1));
    }
    public static int factorial(int num,int fact){
        if(num>0){
            fact=fact*num;
            num--;
            return factorial(num,fact);
        }
        return fact;
    }
}
