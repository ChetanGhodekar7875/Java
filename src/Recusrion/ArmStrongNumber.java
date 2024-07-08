package Recusrion;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int num=153,res=0;
        while (num!=0){
            int rem=num%10;
            num/=10;
             res+=test(rem,3,1,0);
        }
        System.out.println(res);

    }
//    public static int reminder(int num,int rem){
//        if(num!=0){
//            rem=num%10;
//            num/=10;
//            return test(rem,3,1,0);
//        }
//
//        return rem;
//    }
    public static int test(int num,int digit,int out,int sum){
        if(digit!=0){
            out=out*num;
            sum+=out;
            digit--;
            return test(num,digit,out,sum);
        }
        return out;
    }
}
