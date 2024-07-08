package Operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        int a=15;
        int b=13;

        boolean status=((a>b)&&(a<b));
        System.out.println(status);//false

        status=((a>b)||(a<b));
        System.out.println(status);//true

        System.out.println(!(status));//false
    }
}
