package Test;

public class ArmStrong {
    static int fact=1;
    public static void main(String[] args) {
        int num=153;
        while (num!=0) {
            int temp=num%10;
            fact = fact(temp);
            System.out.println(fact);
            fact=1;
            num/=10;
        }
    }
    public static int fact(int no){
        if(no!=0){
            fact=fact*no;
            no--;
            fact(no);
        }
        return fact;
    }
}
