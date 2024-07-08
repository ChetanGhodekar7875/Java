package Looping;

public class MagicNumber {
    public static void main(String[] args) {
        int num=64,sum=0;
        while (num!=0){
            int rem=num%10;
            sum=sum+rem;
            if(sum>9){
                num=sum;
                sum=0;
            }
            num=num/10;
        }
        System.out.println(sum);
        if(sum==1){
            System.out.println("MAGIC NUMBER ");
        }else {
            System.out.println("NOT A MAGIC NUMBER");
        }
    }
}
